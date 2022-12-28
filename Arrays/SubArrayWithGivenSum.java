package Arrays;

public class SubArrayWithGivenSum {

    // Naive Approach
    public static boolean isSubSum(int arr[], int sum){
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr+=arr[j];
                if (curr == sum)
                    return true;
            }
        }
        return false;
    }

    // Efficient Approach
    public static boolean isSubSumEff(int arr[], int sum){
        int s = 0, curr = 0;
        for (int e = 0; e < arr.length; e++) {
            curr+=arr[e];
            while (sum <curr){
                curr-=arr[s];
                s++;
            }
            if (curr == sum)
                return true;
        }
        return false;
    }
}
