package Queue;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        try{
            queue.enqueue(5);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            System.out.println(queue.getSize());
            System.out.println(queue.getFront());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
