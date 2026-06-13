package Queue;

class CircularQueue {
    private int[] arr;
    private int front;
    private int size;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(int data) throws Exception {
        if (isFull()) throw new Exception("Queue is full");
        int idx = (front + size) % arr.length;
        arr[idx] = data;
        size++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");
        int data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    public int getFront() {
        return arr[front];
    }
    public int getSize() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[(front + i) % arr.length] + " ");
        System.out.println();
    }
}
