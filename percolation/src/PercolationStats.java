import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/**
 * Created by User on 26.07.2017.
 */
public class PercolationStats {

    private final double[] results;

    private double mean;
    private double stddev;

    // perform trials independent experiments on an n-by-n grid
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) throw new IllegalArgumentException();
        this.results = new double[trials];
        int tries = trials;
        while (tries > 0) {
            Percolation p = new Percolation(n);
            do {
                int row = StdRandom.uniform(n) + 1;
                int col = StdRandom.uniform(n) + 1;
                if (!p.isOpen(row, col)) {
                    p.open(row, col);
                }
            } while (!p.percolates());
            this.results[trials - tries] = (p.numberOfOpenSites() / Math.pow(n, 2));
            tries--;
        }
        this.mean = mean();
        this.stddev = stddev();
    }

    // sample mean of p threshold
    public double mean() {
        return StdStats.mean(results);
    }
    // sample standard deviation of p threshold
    public double stddev() {
        return StdStats.stddev(results);
    }
    // low  endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean - 1.96d * stddev / Math.sqrt(results.length);
    }
    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean + 1.96d * stddev / Math.sqrt(results.length);
    }

    // test client (described below)
    public static void main(String[] args) {
        int size;
        int trials;
        if (args.length == 2) {
            size = Integer.parseInt(args[0]);
            trials = Integer.parseInt(args[1]);
        } else {
            throw new IllegalArgumentException("Expected 2 arguments instead of " + args.length);
        }

        PercolationStats stats = new PercolationStats(size, trials);

        System.out.println(stats.mean());
        System.out.println(stats.stddev());
        System.out.println("[" + stats.confidenceLo() + "], [" + stats.confidenceHi() + "]");
    }
}
