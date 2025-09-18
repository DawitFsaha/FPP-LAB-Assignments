package lab6.prob4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node(); // header is dummy node (value = null)
    }

    // 1. adds to the end of the list
    public void addLast(String item) {
        Node newNode = new Node();
        newNode.value = item;

        Node current = header;
        // traverse to the end
        while (current.next != null) {
            current = current.next;
        }
        // link newNode
        current.next = newNode;
        newNode.previous = current;
    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        Node current = header.next; // skip header
        while (current != null) {
            if (current.value.equals(item)) {
                // unlink current
                Node prev = current.previous;
                Node next = current.next;
                if (prev != null) prev.next = next;
                if (next != null) next.previous = prev;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        if (header.next == null) {
            return false; // empty list
        }
        Node first = header.next;
        Node second = first.next;
        header.next = second;
        if (second != null) {
            second.previous = header;
        }
        return true;
    }

    // 4. Prints the list from last to first
    public void printReverse() {
        if (header.next == null) {
            System.out.println("[]");
            return;
        }
        Node current = header;
        // move to last node
        while (current.next != null) {
            current = current.next;
        }
        // traverse backward
        StringBuilder sb = new StringBuilder("[");
        while (current != header) {
            sb.append(current.value);
            if (current.previous != header) sb.append(" ");
            current = current.previous;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = header.next;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) sb.append(" ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("Initial list: " + list);

        // Test remove
        list.remove("Harry");
        System.out.println("After removing Harry: " + list);

        // Test removeFirst
        list.removeFirst();
        System.out.println("After removeFirst: " + list);

        // Test printReverse
        list.addLast("Dawit");
        list.addLast("Carol");
        System.out.println("List now: " + list);
        System.out.print("Reversed print: ");
        list.printReverse();
    }
}
