package Arrays;

public class MaximumConsecutiveOnesInBinaryArray {
    // Naive Approach
    public static int maxConsecutiveOnes(int arr[]){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
                int curr = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == 1) curr++;
                    else
                        break;
                }
                res = Math.max(res,curr);
            }
        return res;
    }

    // Efficient Approach
    public static int maxConsecutiveOnesEff(int arr[]){
        int res = 0,curr=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                curr = 0;
            else {
                curr++;
                res = Math.max(curr,res);
            }
        }
        return res;
    }

}
