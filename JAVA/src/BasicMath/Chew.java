package BasicMath;

public class Chew {
    public static void main(String[] args) {
        System.out.println(chewbacca(4545));
    }
    public static int chewbacca(int n){
        int ans = 0;
        int mul = 1;

        while(n != 0){
            int rem = n % 10;

            if(rem >= 5 && n != 9){
                ans = ans + (9 - rem) * mul;
            }else{
                ans = ans + rem * mul;
            }
            mul = mul * 10;
            n = n/10;
        }
        return ans;
    }
}
