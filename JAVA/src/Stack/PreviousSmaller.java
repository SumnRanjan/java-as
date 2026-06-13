package Stack;
import  java.util.*;
import java.util.Stack;

public class PreviousSmaller {
    public static void main(String[] args) {
        int [] arr = {5, 2, 6, 8, 4};
        int n = arr.length;
        int [] ans = previousSmaller(arr, n);
        for(int an : ans){
            System.out.print(an + " ");
        }
    }

    public static int[] previousSmaller(int []arr, int n) {
        // Complete the function
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[n];

        for(int i = 0 ; i < n ; i++){

            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
}
