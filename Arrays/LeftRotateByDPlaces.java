package Arrays;

import java.util.Arrays;

public class LeftRotateByDPlaces {

    // Naive Approach
    public static void lRotate(int arr[], int d){
        for (int i = 0; i < d; i++) {
            LeftRotateByOne.lRotateOne(arr);
        }
    }

    // Efficient Approach
    public static void leftRotate(int arr[], int d){
        int temp[] = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
        for (int i = d; i < arr.length; i++)
            arr[i-d] = arr[i];
        for(int i = 0; i < d; i++)
            arr[arr.length - d + i] = temp[i];
    }

    // More Efficient Approach
    public static void leftRotateEff(int arr[] , int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int arr[],int start, int end){
        while (end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
