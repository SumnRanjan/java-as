package Recursion;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        lexiCount(13, 0);
    }

    public static void lexiCount(int n , int curr){
        if(curr > n){
            return;
        }

        System.out.print(curr + " ");
        int i = 0;
        if(curr == 0){
            i = 1;
        }

        while(i <= 9){
            lexiCount(n , curr * 10 + i);
            i++;
        }
    }
}
