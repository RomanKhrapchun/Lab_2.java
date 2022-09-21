package Task_1;


public class Task_1 {
    public static void Iter(final Iterable iterable) {
        for(final Object item : iterable) {
            System.out.println(item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final DoubleLinkedList DoubleLinkedList = new DoubleLinkedList();
        //Add first element
        DoubleLinkedList.addHead(1);
        DoubleLinkedList.addHead(2);

        Iter(DoubleLinkedList);

        //Add last elements
        DoubleLinkedList.addTail(3);
        DoubleLinkedList.addTail(4);

        Iter(DoubleLinkedList);

        System.out.println("First element = " + DoubleLinkedList.getHead());
        System.out.println("Last element = " + DoubleLinkedList.getTail());
        System.out.println();

        Iter(DoubleLinkedList);

        System.out.println("Out of range");
        try {
            System.out.println(DoubleLinkedList.get(1));
            System.out.println(DoubleLinkedList.get(2));
        } catch (final IndexOutOfBoundsException e) {
            System.out.println("Exception IndexOutOfBoundsException has been caught");
        }

    }
}

