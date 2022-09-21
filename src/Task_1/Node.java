package Task_1;

public class Node {
    public int elem;
    public Node previous;
    public Node next;

    public Node(int elem) {
        this.elem = elem;
    }

    @Override
    public String toString() {
        return Integer.valueOf(elem).toString();
    }
}
