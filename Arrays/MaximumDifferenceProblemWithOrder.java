package Arrays;

public class MaximumDifferenceProblemWithOrder {

    // Naive Approach
    public static int maxDiff(int arr[]){
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }

    // Efficient Approach
    public static int maxDiffEff(int arr[]){
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res,arr[i]-minVal);
            minVal = Math.min(minVal,arr[i]);
        }
        return res;
    }
}
