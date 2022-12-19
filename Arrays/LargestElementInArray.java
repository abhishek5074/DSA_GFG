package Arrays;

import java.util.Scanner;

public class LargestElementInArray {
    // Naive Approach
    public static int getLargest(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }

    // Efficient Approach
    public static int getLargestEff(int arr[]) {
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[largest] < arr[i])
                largest = i;
        }
        return largest;
    }

}
