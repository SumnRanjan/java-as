package Stack;

public class Stack {
    private int[] arr;
    private int top;

    public Stack() {
        this.arr = new int[5];
        this.top = -1;
    }

    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int data) {
        try {
            if (isFull()) {
                throw new Exception("Stack is full");
            }
            arr[++top] = data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int pop() {
        try {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return arr[top--];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public int peek() {
        try {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return arr[top];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
