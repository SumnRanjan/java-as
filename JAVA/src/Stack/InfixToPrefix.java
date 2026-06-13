package Stack;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String ans = infixToPrefix("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println(ans);
    }

    private static int precedence(char ch) {
        return switch (ch) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }

    public static String infixToPrefix(String s) {
        StringBuilder input = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(') input.append(')');
            else if (ch == ')') input.append('(');
            else input.append(ch);
        }

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : input.toString().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            } else {
                while (!st.isEmpty() && (precedence(st.peek()) > precedence(ch) || (precedence(st.peek()) == precedence(ch) && ch != '^'))) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
