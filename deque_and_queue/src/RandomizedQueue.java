import edu.princeton.cs.algs4.StdRandom;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * Created by User on 06.08.2017.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {

    private final List<Item> items;

    public RandomizedQueue() {
        items = new LinkedList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }
    public void enqueue(Item item) {
        if (item == null) throw new IllegalArgumentException("null");
        items.add(item);
    }
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("queue is empty");
        return items.remove(StdRandom.uniform(items.size()));
    }
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException("queue is empty");
        return items.get(StdRandom.uniform(items.size()));
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private final List<Item> list = new ArrayList<>(items);
            @Override
            public boolean hasNext() {
                return !list.isEmpty();
            }

            @Override
            public Item next() {
                if (list.isEmpty()) throw new NoSuchElementException();
                return list.remove(StdRandom.uniform(list.size()));
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
