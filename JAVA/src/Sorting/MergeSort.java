package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5 , 2 , 3 , 9 , 4 , 5 , 7};
        arr = mergeSort(arr , 0  , arr.length - 1);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }

    public static int [] mergeSort(int [] arr , int low , int high){
        if(low >= high){
            return new int[]{arr[low]};
        }
        int mid = low + (high - low) / 2;
        int [] left = mergeSort(arr , low , mid);
        int [] right = mergeSort(arr , mid + 1 , high);
        return  merge(left , right);
    }

    public static int[] merge(int [] arr1 , int [] arr2){
        int [] ans = new int[arr1.length + arr2.length];
        int i = 0 , j = 0 , k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];
            }
            else{
                ans[k++] = arr2[j++];
            }
        }

        while (i < arr1.length){
            ans[k++] = arr1[i++];
        }

        while(j < arr2.length){
            ans[k++] = arr2[j++];
        }

        return ans;
    }

}
