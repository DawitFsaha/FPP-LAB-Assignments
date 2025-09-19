package lab7.problem1;

public class ArrayQueue {
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int[] circularQueue = new int[DEFAULT_CAPACITY];
    private int size;
    private int front;
    private int rear;

    public ArrayQueue(){
        capacity = DEFAULT_CAPACITY;
        size = 0;
        front = -1;
        rear = -1;
    }

    public void enqueue(int num){
        if(size == capacity)
            resize();
        rear = (rear + 1)%capacity;
        circularQueue[rear] = num;
        size++;
        if(front == -1)
            front ++;
    }

    public Integer dequeue(){
        if(size > 0){
            int value =circularQueue[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        }else return null;
    }

    public Integer peak(){
        if(size > 0)
            return circularQueue[front];
        return null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void resize(){
        int[] temp = new int[capacity*2];
        int pos = front;

        for(int i = 0; i<size; i++){
            temp[i] = circularQueue[pos++ % capacity];
        }
        circularQueue = temp;
        capacity = 2*capacity;
        front=0;
        rear=size-1;
    }

    public String toString(){
        if(size > 0) {
            int pos = front;
            StringBuilder sb = new StringBuilder("[ ");
            for (int i = 0; i < size - 1; i++) {
                sb.append(circularQueue[pos++ % capacity] + ", ");
            }
            sb.append(circularQueue[pos % capacity] + " ]");

            return sb.toString();
        }else{
            return "[]";
        }
    }



}
