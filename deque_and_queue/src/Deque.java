import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private Node head;
    private Node tail;
    private int size;

    public Deque() {
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (item == null) throw new IllegalArgumentException("null");
        Node node = new Node(item);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        size++;
    }

    public void addLast(Item item) {
        if (item == null) throw new IllegalArgumentException("null");
        Node node = new Node(item);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");
        Node result = head;
        if (head.getNext() == null) {
            head = null;
            tail = null;
        }
        else {
            head = head.getNext();
            head.setPrev(null);
        }
        size--;
        return result.getValue();
    }

    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");
        Node result = tail;
        if (tail.getPrev() == null) {
            tail = null;
            head = null;
        }
        else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
        return result.getValue();
    }

    private class Node {

        private Node next;
        private Node prev;
        private final Item value;

        Node(Item value) {
            this.value = value;
        }

        Node(Node prev, Node next, Item value) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }

        Node getPrev() {
            return prev;
        }

        void setPrev(Node prev) {
            this.prev = prev;
        }

        Item getValue() {
            return value;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node curr = new Node(null, head, null);
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
            @Override
            public boolean hasNext() {
                return curr.getNext() != null;
            }
            @Override
            public Item next() {
                curr = curr.getNext();
                if (curr == null || curr.getValue() == null) throw new NoSuchElementException();
                return curr.getValue();
            }
        };
    }

    public static void main(String[] args) {
        Deque<String> deque = new Deque<>();
        deque.addFirst("2");
        deque.addLast("3");
        deque.removeFirst();
        deque.removeFirst();
        deque.addLast("4");
        deque.addFirst("1");
        for (String aDeque : deque) {
            System.out.println(aDeque);
        }
    }
}
