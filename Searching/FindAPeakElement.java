package Searching;

public class FindAPeakElement {

    public static int getPeak(int arr[]){
        if (arr.length == 1) return arr[0];
        if (arr[0] >= arr[1]) return arr[0];
        if (arr[arr.length - 1] >= arr[arr.length - 2]) return arr[arr.length
                - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                return arr[i];
        }
        return -1;
    }

    public static int getAPeak(int arr[], int n){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low+high)/2;
            if ((mid == 0 || arr[mid-1]<=arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid]))
                return mid;
            if (mid > 0 && arr[mid-1] >= arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
