package Searching;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.println(bSearch(arr, 25));
    }

    // Iterative Approach
    public static int bSearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    // Recursive Approach
    public static int bSearchRecur(int arr[], int low, int high, int x) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        else if (arr[mid] > x) return bSearchRecur(arr, low, mid - 1, x);
        else return bSearchRecur(arr, mid + 1, high, x);
    }
}
