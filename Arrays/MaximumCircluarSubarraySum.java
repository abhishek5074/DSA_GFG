package Arrays;

public class MaximumCircluarSubarraySum {

    // Naive Approach
    public static int maxCircularSum(int arr[]){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int index = (i + j ) % arr.length;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max,curr_sum);
            }
            res = Math.max(res,curr_max);
        }
        return  res;
    }


    public static int normalMaxSum(int arr[]){
        int res = arr[0], maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i],maxEnding+arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }

    // Efficient Approach
    public static int maxCircularSumEff(int arr[]){
        int max_normal = normalMaxSum(arr);
        if (max_normal < 0)
            return max_normal;
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);

        return Math.max(max_normal, max_circular);
    }

}
