package lab7.problem1;

public class ArrayQueueImpl {

    static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(19);
        queue.enqueue(23);
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(56);
        queue.enqueue(17);
        queue.enqueue(61);

        queue.enqueue(75);
        System.out.println(queue);
        System.out.println("Dequeue : " + queue.dequeue());
        queue.enqueue(54);
        queue.enqueue(154);
        System.out.println(queue);;

        System.out.println("Size : " + queue.size());
        System.out.println("Dequeue : " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Peak : " + queue.peak());
        System.out.println("Is Empty : "+queue.isEmpty());


    }
}
