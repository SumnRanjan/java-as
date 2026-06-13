package BinarySearch;

public class RangeWithBS {
    public static void main(String[] args) {
        long L = 1 , R = 20 , K = 5;
        long ans = RangeWithBinarySearch(L , R , K , L);
        System.out.println(ans);
    }

    public static long RangeWithBinarySearch(long s , long e , long k , long L){
        long ans = -1;
        while(s <= e){
            long mid = s + (e - s)/ 2;

            long smallestNumber = helper(L , mid);

            if(smallestNumber >= k){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }

    public static long helper(long L , long mid){
        long sum = 0;

        for(long i = L ; i <= mid ; i++){
//            sum += (int) Math.log10(i) + 1;
            sum += String.valueOf(i).length();
        }


        return sum;
    }
}
