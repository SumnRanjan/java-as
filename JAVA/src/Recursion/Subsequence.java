package Recursion;

public class Subsequence {
    public static void subsequence(String str , String ans ,int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        subsequence(str , ans , i+1);
        subsequence(str , ans + str.charAt(i) , i+1);
    }

    public static void subsequence2(String str , String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        subsequence2(str.substring(1) , ans);
        subsequence2(str.substring(1) , ans+str.charAt(0));
    }
    public static void main(String[] args) {
        String ans = "";
//        subsequence("abc" , ans , 0);
        subsequence2("abc" , "");
    }
}
