
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
import java.util.Stack;

public class Board {

    private final short[][] blocks;
    private final int n;
    private int emptyX, emptyY;
    private Board twin;

    // construct a board from an n-by-n array of blocks
    // (where blocks[i][j] = block in row i, column j)
    public Board(int[][] blocks) {
        if (blocks == null || blocks[0].length != blocks.length)
            throw new IllegalArgumentException("Invalid input");
        this.blocks = cloneBlocksIntToShort(blocks);
        n = blocks.length;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (blocks[i][k] == 0) {
                    emptyX = k;
                    emptyY = i;
                    break;
                }
            }
        }
    }

    // board dimension n
    public int dimension() {
        return n;
    }

    // number of blocks out of place
    public int hamming() {
        int hamming = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (blocks[i][k] == 0) continue;
                if (blocks[i][k] != i * n + (k + 1)) {
                    hamming++;
                }
            }
        }
        return hamming;
    }

    // sum of Manhattan distances between blocks and goal
    public int manhattan() {
        int manhattan = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int val = blocks[i][k];
                if (val == 0) continue;

                int deltaX = Math.abs((val - 1) % n - k);
                int deltaY = Math.abs((val - 1) / n - i);

                manhattan += deltaX + deltaY;
            }
        }
        return manhattan;
    }

    // is this board the goal board?
    public boolean isGoal() {
        return hamming() == 0;
    }

    // a board that is obtained by exchanging any pair of blocks
    public Board twin() {
        if (twin == null) {
            int val1,
                    val2;
            int posX1, posY1, posX2, posY2;
            do {
                posX1 = StdRandom.uniform(n);
                posY1 = StdRandom.uniform(n);
                val1 = blocks[posY1][posX1];
            }
            while (val1 == 0);
            do {
                posX2 = StdRandom.uniform(n);
                posY2 = StdRandom.uniform(n);
                val2 = blocks[posY2][posX2];
            }
            while (val2 == 0 || posX1 == posX2 && posY1 == posY2);
            int[][] result = cloneBlocksShortToInt(this.blocks);
            exchange(result, posX1, posY1, posX2, posY2);
            twin = new Board(result);
        }
        return twin;
    }

    // does this board equal y?
    public boolean equals(Object y) {
        if (y == null) return false;
        if (y == this) return true;
        if (!(y.getClass() == this.getClass())) return false;
        if (((Board) y).dimension() != this.dimension()) return false;
        if (!Arrays.deepEquals(blocks, ((Board) y).blocks))
            return false;
        return true;
    }

    // all neighboring boards
    public Iterable<Board> neighbors() {
        Stack<Board> result = new Stack<>();
        int[][] _blocks;
        Board board;
        if (emptyX >= 1) {
            _blocks = cloneBlocksShortToInt(this.blocks);
            swipe(_blocks, emptyX - 1, emptyY, 1);
            board = new Board(_blocks);
            result.push(board);
        }
        if (emptyX < n - 1) {
            _blocks = cloneBlocksShortToInt(this.blocks);
            swipe(_blocks, emptyX + 1, emptyY, 3);
            board = new Board(_blocks);
            result.push(board);
        }
        if (emptyY >= 1) {
            _blocks = cloneBlocksShortToInt(this.blocks);
            swipe(_blocks, emptyX, emptyY - 1, 2);
            board = new Board(_blocks);
            result.push(board);
        }
        if (emptyY < n - 1) {
            _blocks = cloneBlocksShortToInt(this.blocks);
            swipe(_blocks, emptyX, emptyY + 1, 0);
            board = new Board(_blocks);
            result.push(board);
        }
        return result;
    }

    // string representation of this board (in the output format specified below)
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d\n", n));
        for (short[] row : blocks) {
            for (short val : row) {
                sb.append(String.format(" %2d ", val));
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    private static void exchange(int[][] blocks, int posXOne, int posYOne, int posXTwo, int posYTwo) {
        int temp = blocks[posYOne][posXOne];
        blocks[posYOne][posXOne] = blocks[posYTwo][posXTwo];
        blocks[posYTwo][posXTwo] = temp;
    }

    /**
     * @param direction 0 - up
     *                  1 - right
     *                  2 - down
     *                  3 - left
     */
    private static void swipe(int[][] blocks, int posX, int posY, int direction) {
        switch (direction) {
            case 0:
                blocks[posY - 1][posX] = blocks[posY][posX];
                break;
            case 1:
                blocks[posY][posX + 1] = blocks[posY][posX];
                break;
            case 2:
                blocks[posY + 1][posX] = blocks[posY][posX];
                break;
            case 3:
                blocks[posY][posX - 1] = blocks[posY][posX];
                break;
        }
        blocks[posY][posX] = 0;
    }

    private int[][] cloneBlocks(int[][] given) {
        int[][] result = new int[given.length][given.length];
        for (int i = 0; i < given.length; i++) {
            result[i] = Arrays.copyOf(given[i], given.length);
        }
        return result;
    }
    private int[][] cloneBlocksShortToInt(short[][] given) {
        int[][] result = new int[given.length][given.length];
        for (int i = 0; i < given.length; i++) {
            for (int k = 0; k < given.length; k++) {
                result[i][k] = (int) given[i][k];
            }
        }
        return result;
    }
    private short[][] cloneBlocksIntToShort(int[][] given) {
        short[][] result = new short[given.length][given.length];
        for (int i = 0; i < given.length; i++) {
            for (int k = 0; k < given.length; k++) {
                result[i][k] = (short) given[i][k];
            }
        }
        return result;
    }

    // unit tests (not graded)
    public static void main(String[] args) {
        int[][] dano = {{1, 2, 3}, {4, 5, 6}, {8, 7, 0}};
        int manhattan = 0;
        for (int i = 0; i < dano.length; i++) {
            for (int k = 0; k < dano.length; k++) {
                int val = dano[i][k];
                if (val == 0) continue;

                int deltaX = Math.abs((val - 1) % dano.length - k);
                int deltaY = Math.abs((val - 1) / dano.length - i);

                manhattan += deltaX + deltaY;
            }
        }
        System.out.println(manhattan);
    }
}