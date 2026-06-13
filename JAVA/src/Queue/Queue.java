package Queue;

public class Queue {
    private int[] arr;
    private int front;
    private int size;

    public Queue(){
        this(5);
    }
    public Queue(int size){
        this.arr = new int[size];
        this.front = 0;
        this.size = 0;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int data) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        arr[size++] = data;
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int data = arr[front++];
        size--;
        return data;
    }

    public void display(){
        for (int i = front; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int getFront(){
        return arr[front];
    }

    public int getSize(){
        return size;
    }
}
