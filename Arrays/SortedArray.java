package Arrays;

public class SortedArray {
    //Naive Approach
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] > arr[i])
                    return false;
            }
        }
            return true;
    }

    // Efficient Approach
    public static boolean isSortedEff(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

}
