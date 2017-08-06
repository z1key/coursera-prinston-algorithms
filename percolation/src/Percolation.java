import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private final int n;
    private final boolean[] grid;

    private int openedSites;
    private final WeightedQuickUnionUF uf;
    private boolean isPercolate;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if (n < 1) throw new IllegalArgumentException("Not valid size of grid");
        this.n = n;
        grid = new boolean[n * n];
        uf = new WeightedQuickUnionUF(n * (n + 1) + 1);
    }

    // open site (row, col) if it is not open already
    public void open(int row, int col) {
        if (row > n || col > n || row < 1 || col < 1)
            throw new IllegalArgumentException("Out of bounds");
        if (isOpen(row, col)) return;
        int index = n * (row - 1) + col;
        grid[index - 1] = true;
        openedSites++;
        if (row == 1) {
            uf.union(0, index);
        }
        if (row == n) {
            uf.union(n * n + col, index);
        }
        checkNeighboursForOpen(row, col);
    }

    private void checkNeighboursForOpen(int row, int col) {
        if (row > 1) {
            if (isOpen(row - 1, col))
                uf.union(n * (row - 2) + col, n * (row - 1) + col);
        }
        if (row < n) {
            if (isOpen(row + 1, col))
                uf.union(n * row + col, n * (row - 1) + col);
        }
        if (col > 1) {
            if (isOpen(row, col - 1))
                uf.union(n * (row - 1) + col - 1, n * (row - 1) + col);
        }
        if (col < n) {
            if (isOpen(row, col + 1))
                uf.union(n * (row - 1) + col + 1, n * (row - 1) + col);
        }
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (row > n || col > n || row < 1 || col < 1)
            throw new IllegalArgumentException("Out of bounds");
        return grid[n * (row - 1) + col - 1];
    }

    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        if (row > n || col > n || row < 1 || col < 1)
            throw new IllegalArgumentException("Out of bounds");
        return isOpen(row, col) && uf.connected(0, n * (row - 1) + col);
    }

    // number of open sites
    public int numberOfOpenSites() {
        return openedSites;
    }

    // does the system percolate?
    public boolean percolates() {
        if (isPercolate) return true;
        for (int i = 1; i <= n; i++) {
            if (isFull(n, i)) {
                isPercolate = true;
            }
        }
        return isPercolate;
    }

    // test client (optional)
    public static void main(String[] args) {
        Percolation percolation = new Percolation(10);
        percolation.open(1, 1);
        percolation.open(2, 1);
        percolation.open(3, 1);
        percolation.open(4, 1);
        percolation.open(5, 1);
        percolation.open(6, 1);
        percolation.open(7, 1);
        percolation.open(8, 1);
        percolation.open(9, 1);
        percolation.open(10, 1);
        percolation.open(10, 5);
        percolation.open(10, 9);
        System.out.println(percolation.percolates());
    }
}
