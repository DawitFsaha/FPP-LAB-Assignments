package lab7.problem2;

public class StackLinkedList {

    private Node top;
    private int size;

    public StackLinkedList() {
        top = null;
        size = 0;
    }

    private class Node{
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int num){
        Node newNode = new Node(num);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Integer peak(){
        if(size > 0)
            return top.data;
        else return null;
    }

    public Integer pop(){
        Integer num = peak();
        if(num != null){
            top = top.next;
            size--;
        }
        return num;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){ // returns number of items in the stack
        return size;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[ ");
        Node current = top;
        while (current != null){
            sb.append(current.data);
            current = current.next;
            if (current != null) { // only add comma if another element follows
                sb.append(", ");
            }
        }
        sb.append(" ]");

        return sb.toString();
    }

    public static void main(String[] args) {
        StackLinkedList st = new StackLinkedList();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println(STR."Size = \{st.size()}");
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }

}
