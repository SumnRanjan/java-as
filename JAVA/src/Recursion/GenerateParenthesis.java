package Recursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
        generateParenthesis(3 , 0 , 0 , "");
    }

    public static void generateParenthesis(int n , int open , int close , String ans){
        if(ans.length() == 2 * n){
            System.out.println(ans);
            return;
        }
        if(open < n){
            generateParenthesis(n , open + 1 , close , ans+"(");
        }
        if(close < open && close < n){
            generateParenthesis(n , open , close+1 , ans + ")");
        }
    }
}
