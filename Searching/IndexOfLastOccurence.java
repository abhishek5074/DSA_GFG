package Searching;

public class IndexOfLastOccurence {

    // Naive Approach
    public static int lastOccur(int arr[],int x){
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Efficient Recursive Approach
    public static int lastOccurEffRecur(int arr[], int low, int high, int x){
        if (low > high) return -1;
        int mid = (low + high)/2;
        if (arr[mid]>x)
            return lastOccurEffRecur(arr,low,mid-1,x);
        else if (arr[mid]<x)
            return lastOccurEffRecur(arr,mid+1,high,x);

        else {
            if (mid == arr.length -1 || arr[mid]!=arr[mid+1])
                return mid;
            else
                return lastOccurEffRecur(arr,mid+1,high,x);
        }
    }

    // Efficient Approach
    public static int lastOccurEff(int arr[], int x){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid]<x)
                low = mid + 1;
            else if (arr[mid]>x)
                high = mid -1;

            else {
                if (mid!=arr.length-1 || arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
