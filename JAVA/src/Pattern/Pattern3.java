package Pattern;

import javax.swing.text.html.StyleSheet;
import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int star = n;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");
            }

            for (int j = 0 ; j < star ; j++){
                System.out.print("*");
            }

            star--;
            space = space+2;
            System.out.println();

        }
    }
}
