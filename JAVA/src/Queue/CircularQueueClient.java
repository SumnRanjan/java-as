package Queue;

public class CircularQueueClient {
    public static void main(String[] args) {
        try{
            CircularQueue queue = new CircularQueue(5);
            queue.enqueue(3);
            queue.enqueue(2);
            queue.enqueue(1);
            System.out.println(queue.getFront());
            queue.dequeue();
            System.out.println(queue.getFront());
            queue.dequeue();
            System.out.println(queue.getFront());
            queue.dequeue();
            queue.dequeue();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
