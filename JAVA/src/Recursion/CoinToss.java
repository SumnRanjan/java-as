package Recursion;

public class CoinToss {
    public static void coinToss(int n , String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        coinToss(n - 1 , ans+'H');
        coinToss(n - 1 , ans+'T');
    }

    public static void coinToss2(int n , String ans ){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        if(ans.isEmpty() || ans.charAt(ans.length() - 1) != 'H'){
            coinToss2(n - 1 , ans+'H');
        }
        coinToss2(n - 1 , ans+'T');
    }

    public static void main(String[] args) {
        String ans = "";
//        coinToss(3 , ans);
        coinToss2(3 , ans);
    }
}
