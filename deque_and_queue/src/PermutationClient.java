import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by User on 06.08.2017.
 */
public class PermutationClient {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        if (count < 0) throw new IllegalArgumentException("k < 0");
        StdOut.print("Type strings:");
        String[] strings = StdIn.readAllStrings();
        if (count > strings.length) throw new IllegalArgumentException("k is greater than strings quantity");
        RandomizedQueue<String> queue = new RandomizedQueue<>();
        for (String s : strings) {
            queue.enquue(s);
        }
        while (count > 0) {
            StdOut.println(queue.dequeue());
            count--;
        }
    }
}
