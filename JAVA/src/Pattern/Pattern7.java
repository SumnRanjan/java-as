package Pattern;

import java.util.Scanner;
// vertical mirroring within a row
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = 1;
        int star = 1;
        int space = n - 1;

        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= space ; j++){
                System.out.print(" ");
            }
            int s = v;
            for(int j = 1; j <= star ; j++){
                System.out.print(s);
                if(j < i){
                    s++;
                }else{
                    s--;
                }
            }
            v++;
            star+=2;
            space--;
            System.out.println();
        }
    }
}
