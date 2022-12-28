package Arrays;

public class SlidingWindowTechnique {
    // Find the maximum sum of K consecutive elements
    // Naive Approach
    public static int maxSum(int arr[], int k) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < arr.length; i++) {
            int curr = 0;
            for (int j = 0; j < k; j++) {
                curr+= arr[i+j];
            }
            res = Math.max(res,curr);
        }
        return res;
    }

    // Efficient Approach Sliding Window
    public static int maxSumSlidingWindow(int arr[], int k){
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr+= arr[i];
        }
        int res = curr;
        for (int i = k; i < arr.length; i++) {
            curr = curr + arr[i] - arr[i-k];
            res = Math.max(res,curr);
        }
        return res;
    }
}
