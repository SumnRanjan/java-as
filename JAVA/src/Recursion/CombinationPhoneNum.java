package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationPhoneNum {
    public static void main(String[] args) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>result = new ArrayList<>();
        solve("23" , 0 , "" , map , result);
        for(String s : result){
            System.out.print(s + " ");
        }
    }

    public static void solve(String digits , int i , String curr , String [] map , List<String> result){
        if(i == digits.length()){
            result.add(curr);
            return;
        }

        String letter = map[digits.charAt(i) - '0'];
        for(char ch : letter.toCharArray()){
            solve(digits , i + 1 , curr + ch , map , result);
        }
    }
}
