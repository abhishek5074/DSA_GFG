package Arrays;

public class MaximumSumSubarray {

    // Naive Approach
    public static int maxSum(int arr[]) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    // Efficient Approach
    public static int maxSumEff(int arr[]){
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
        return  res;
    }
}
