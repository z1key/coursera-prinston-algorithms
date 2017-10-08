import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdOut;

import java.util.*;

public class Solver {

    private final boolean isSolvable;
    private SearchNode solution;


    private static class SearchNode {

        private final int priority;
        private final Board board;
        private final SearchNode prevNode;
        private final int moves;

        public SearchNode(Board board, SearchNode prevNode, int moves) {
            this.board = board;
            this.prevNode = prevNode;
            this.moves = moves;
            this.priority = moves + board.manhattan();
        }
    }




    // find a solution to the initial board (using the A* algorithm)
    public Solver(Board initial) {
        if (initial == null) throw new IllegalArgumentException("Board is null.");
        boolean isGivenSolvable = false;
        boolean isTwinSolvable = false;

        Comparator<SearchNode> BY_PRIORITY = new Comparator<SearchNode>() {
            @Override
            public int compare(SearchNode o1, SearchNode o2) {
                return o1.priority - o2.priority;
            }
        };

        MinPQ<SearchNode> givenPQ = new MinPQ<>(BY_PRIORITY);
        givenPQ.insert(new SearchNode(initial, null, 0));

        MinPQ<SearchNode> twinPQ = new MinPQ<>(BY_PRIORITY);
        twinPQ.insert(new SearchNode(initial.twin(), null, 0));

        while (!isGivenSolvable && !isTwinSolvable) {
            isGivenSolvable = solve(givenPQ);
            if (isGivenSolvable) break;
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
        Iterable<Board> _solution = solution();
        if (_solution != null) {
            return ((Collection<Board>) _solution).size() - 1;
        } else {
            return -1;
        }
    }

    // sequence of boards in a shortest solution; null if unsolvable
    public Iterable<Board> solution() {
        if (isSolvable()) {
            List<Board> result = new ArrayList<>();
            result.add(solution.board);
            SearchNode currentNode = solution;
            while (currentNode.prevNode != null) {
                result.add(currentNode.prevNode.board);
                currentNode = currentNode.prevNode;
            }
            Collections.reverse(result);
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
                queue.insert(new SearchNode(neighbour, currentNode, currentNode.moves + 1));
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
