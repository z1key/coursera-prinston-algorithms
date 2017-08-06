import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by User on 06.08.2017.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {

    private List<Item> items;

    public RandomizedQueue() {
        items = new LinkedList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }
    public void enquue(Item item) {
        if (item == null) throw new IllegalArgumentException("null");
        items.add(item);
    }
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("queue is empty");
        return items.remove(StdRandom.uniform(items.size()));
    }
    public Item sample() {
        return items.get(StdRandom.uniform(items.size()));
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}
