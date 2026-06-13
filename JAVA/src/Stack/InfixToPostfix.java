package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String ans = infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println(ans);
    }

    private static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };

    }
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            } else if(ch == '('){
                st.add(ch);
            } else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
            } else{
                while(!st.isEmpty() && precedence(ch) <= precedence(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}


