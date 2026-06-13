package Stack;

public class StackClient {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(102);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.peek());
    }
}
