package Searching;

public class CountOnesInASortedBinaryArray {

    // Naive Approach
    public static int countOnes(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
        }
        return count;
    }

    // Efficient Approach
    public static int countOnesEff(int arr[]){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == 0)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid-1] == 0)
                    return arr.length - mid;
                else
                    high = mid - 1;
            }
        }
        return 0;
    }
}
