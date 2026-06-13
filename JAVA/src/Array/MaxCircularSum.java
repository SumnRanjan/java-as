package Array;

public class MaxCircularSum {
    public static int Kadanes(int [] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int ar : arr) {
            sum += ar;
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    public static int maxCircular(int [] arr){
        int normal = Kadanes(arr);

        if (normal < 0) return normal;

        int ts = 0;
        for (int j : arr) {
            ts += j;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1 * arr[i];
        }

        int inverted = ts + Kadanes(arr);
        return Math.max(normal , inverted);
    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , -8 , 7 , 6};
        int ans = maxCircular(arr);
        System.out.println(ans);
    }
}
