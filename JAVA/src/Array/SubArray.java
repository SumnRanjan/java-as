package Array;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printAllSubarrays(arr);
    }

    public static void printAllSubarrays(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

