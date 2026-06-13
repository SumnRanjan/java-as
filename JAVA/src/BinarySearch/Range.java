package BinarySearch;
//Find Smallest N with K Digits in Range
public class Range {
    public static void main(String[] args) {
        long L = 38666;
        long R = 51627;
        long K = 96775;

        long sum = 0;

        for(long i = L ; i <= R ; i++){
            int digit = (int) Math.log10(i) + 1;
            sum += digit;
            if(sum >= K){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
