package Searching;

public class SearchInSortedRotatedArray {

    // Naive Approach
    public static int search(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Efficient Approach
    public static int searchEff(int arr[], int x){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low + high )/ 2 ;
            if (arr[mid] == x) return mid;
            else if(arr[mid] > arr[low]){
                if (arr[mid] > x && arr[low] <= x)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else {
                if (x > arr[mid] && x<= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
