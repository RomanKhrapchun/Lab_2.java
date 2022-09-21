package Task_1;
import java.util.Iterator;

public class DoubleLinkedList implements Iterable{
    public int size = 0;
    private Node head = null;
    private Node tail = null;

    public void addFirst(int elem) {
        Node newNode = new Node(elem);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

     public void addLast(int elem) {
        Node newNode = new Node(elem);
        if (tail == null) {
            head = tail = newNode;
        } else {
            head.next = newNode;
            newNode.previous = head;
            head = newNode;
        }
    }

    public void addHead(final int r) {
        addFirst(r);
    }

    public void addTail(final int r) {
        addLast(r);
    }

    public Node getHead() {
        return head;
    }

    public  Node getTail() {
        return tail;
    }

     public Node get(final int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head;
    }

    public Iterator iterator() {
        return new Itr();
    }

    public int size() {
        return size;
    }

    class Itr implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public Node next() {
            return get(index++);
        }


    }
}
