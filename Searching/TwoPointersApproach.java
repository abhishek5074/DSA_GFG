package Searching;

public class TwoPointersApproach {
    // Find if there is a pair with sum x in a sorted array
    public static boolean isPair(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x)
                    return true;
            }
        }
        return false;
    }

    public static boolean isPairEff(int arr[], int x){
        int i = 0, j = arr.length - 1;
        while (i < j ){
            if (arr[i] + arr[j] == x)
                return true;
            else if(arr[i] + arr[j] < x)
                i++;
            else
                j--;
        }
        return false;
    }
}
