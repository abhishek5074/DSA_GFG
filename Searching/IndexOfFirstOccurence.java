package Searching;

public class IndexOfFirstOccurence {

    public static int firstOccur(int arr[],int x){
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }

    // Efficient Recursive Approach
    public static int firstOccurEffRecur(int arr[], int low, int high, int x){
        if (low > high) return -1;
        int mid = (low + high)/2;
        if (x > arr[mid])
            return firstOccurEffRecur(arr,mid+1,high,x);
        else if (x < arr[mid])
            return firstOccurEffRecur(arr,low,mid-1,x);

        else {
            if (mid == 0 || arr[mid-1]!=arr[mid])
                return mid;
            else
                return firstOccurEffRecur(arr,low,mid-1,x);
        }
    }

    // Efficient Approach
    public static int firstOccurEff(int arr[], int x){
        int low = 0, high = arr.length -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid]>x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;

            else {
                if (mid == 0 || arr[mid-1]!= arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }

}
