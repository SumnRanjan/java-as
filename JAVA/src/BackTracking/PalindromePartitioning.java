package BackTracking;

public class PalindromePartitioning {
    public static void main(String[] args) {
        solve("aab" , "");
    }

    public static void solve(String ques , String ans){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i = 1 ; i <= ques.length() ; i++){
            String curr = ques.substring(0 , i);
            if(isPalindrome(curr)){
                solve(ques.substring(i) , ans + curr + "|");
            }
        }
    }

    public static boolean isPalindrome(String str){
        int l = 0 , r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
