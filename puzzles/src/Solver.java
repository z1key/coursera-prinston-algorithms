import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdOut;

import java.util.Collection;
import java.util.Comparator;
import java.util.Stack;

public class Solver {

    private MinPQ<SearchNode> givenPQ;
    private MinPQ<SearchNode> twinPQ;
    private int moves = 0;
    private boolean isSolvable;
    private SearchNode solution;


    private class SearchNode {

        private int priority;
        private Board board;
        private SearchNode prevNode;

        public SearchNode(Board board, SearchNode prevNode) {
            this.board = board;
            this.prevNode = prevNode;
            this.priority = Solver.this.moves + board.manhattan();
        }
    }

    private static final Comparator<SearchNode> BY_PRIORITY = new Comparator<SearchNode>() {
        @Override
        public int compare(SearchNode o1, SearchNode o2) {
            return o1.priority - o2.priority;
        }
    };


    // find a solution to the initial board (using the A* algorithm)
    public Solver(Board initial) {
        boolean isGivenSolvable = false;
        boolean isTwinSolvable = false;

        givenPQ = new MinPQ<>(BY_PRIORITY);
        givenPQ.insert(new SearchNode(initial, null));

        twinPQ = new MinPQ<>(BY_PRIORITY);
        twinPQ.insert(new SearchNode(initial.twin(), null)); //insert twin Board

        while (!isGivenSolvable && !isTwinSolvable) {
            isGivenSolvable = solve(givenPQ);
            isTwinSolvable = solve(twinPQ);
        }
        isSolvable = isGivenSolvable;
    }

    // is the initial board solvable?
    public boolean isSolvable() {
        return isSolvable;
    }

    // min number of moves to solve initial board; -1 if unsolvable
    public int moves() {
        Iterable solution = solution();
        if (solution != null) {
            return ((Collection) solution).size();
        } else {
            return -1;
        }
    }

    // sequence of boards in a shortest solution; null if unsolvable
    public Iterable<Board> solution() {
        if (isSolvable()) {
            Stack<Board> result = new Stack<>();
            result.push(solution.board);
            SearchNode currentNode = solution;
            while (currentNode.prevNode != null) {
                result.push(currentNode.prevNode.board);
                currentNode = currentNode.prevNode;
            }
            return result;
        } else {
            return null;
        }
    }

    private boolean solve(MinPQ<SearchNode> queue) {
//        if (queue.size() == 0) return false;
        SearchNode currentNode = queue.delMin();
        if (currentNode.board.isGoal()) {
            solution = currentNode;
            return true;
        }
        for (Board neighbour : currentNode.board.neighbors()) {
            if (currentNode.prevNode == null || !neighbour.equals(currentNode.prevNode.board)) {
                queue.insert(new SearchNode(neighbour, currentNode));
            }
        }
        return false;
    }

    // solve a slider puzzle (given below)
    public static void main(String[] args) {
        // create initial board from file
        In in = new In(args[0]);
        int n = in.readInt();
        int[][] blocks = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                blocks[i][j] = in.readInt();
        Board initial = new Board(blocks);

        // solve the puzzle
        Solver solver = new Solver(initial);

        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }
    }
}
