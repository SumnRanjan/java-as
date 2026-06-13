package String;
import java.util.Scanner;

public class InputStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = sc.next();
//        String str1 = sc.nextsLine();

//        System.out.println(str);
//        System.out.println(str1);

        String s1 = "Kamal";
        String s2 = "Kunal";

//        System.out.println(s2.compareTo(s1));

        System.out.println(s1.substring(0));
        System.out.println(s1.substring(0 , 2));


            for (int i = 0; i < s1.length(); i++) {
                for (int j = i+1; j <= s1.length(); j++) {
                    System.out.println(s1.substring(i , j));
            }
        }
    }
}
