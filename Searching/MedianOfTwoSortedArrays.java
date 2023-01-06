package Searching;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    // Naive Approach
    public static double getMed(int arr1[], int arr2[]){
        int[] arr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1,0,arr,0,arr1.length);
        System.arraycopy(arr2,0,arr,arr1.length,arr2.length);

        Arrays.sort(arr);

        if (arr.length % 2 == 0)
            return ((double)(arr[arr.length/2] + arr[(arr.length/2) - 1])/2);
        else
            return arr[arr.length/2];
    }

    // Efficient Approach
    public static double getMedEff(int arr1[], int arr2[]){
        int n1 = arr1.length, n2 = arr2.length;
        int begin1 = 0, end1 = n1;
        while (begin1 <= end1){
            int i1 = (begin1 + end1)/2;
            int i2 = (n1+n2+1)/2 - i1;

            int min1 = (i1 == n1) ? Integer.MAX_VALUE : arr1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : arr1[i1-1];
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : arr2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : arr2[i2 - 1];

            if (max1 <= min2 && max2 <= min1){
                if ((n1 + n2)%2 == 0)
                    return ((double)(Math.max(max1,max2) + Math.min(min1,min2))/2);
                else
                    return  Math.max(max1,max2);
            }
            else if (max1 > min2) end1 = i1 - 1;
            else begin1 = i1 + 1;
        }
        return -1;
    }
}
