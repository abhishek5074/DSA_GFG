package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    // Naive Approach
    public static int removeDuplicatesSortedArray(int arr[]) {
        int temp[] = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    // Efficient Approach
    public static int removeDuplicatesSortedArrayEff(int arr[]) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
