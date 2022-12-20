package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    // Naive Approach
    public static void reverse(int[] arr) {
        int arrRev[] = new int[arr.length];
        int l = arr.length - 1;
        for(int i = 0; i < arr.length ; i++)
            arrRev[i] = arr[l - i];
        for (int i = 0; i < arrRev.length; i++) {
            arr[i] = arrRev[i];
        }
    }

    // Efficient Approach
    public static void reverseEff(int arr[]){
        int start = 0, end = arr.length - 1;
        while (end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
