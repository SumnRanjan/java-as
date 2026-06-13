package Recursion;

public class PhoneNum {
    public static void main(String[] args) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(0 , "23" , "" , map);
    }

    public static void solve(int i , String num , String curr , String [] map){
        if(i == num.length()){
            System.out.print(curr + " ");
            return;
        }

        String letters = map[num.charAt(i) - '0'];
        for (char ch : letters.toCharArray()){
            solve(i+1 , num , curr + ch , map);
        }
    }
}
