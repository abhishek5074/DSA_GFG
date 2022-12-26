package Arrays;

public class MaximumLengthEvenOddSubarray {

    // Naive Approach
    public static int maxEvenOdd(int arr[]) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int curr = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
                    curr++;
               else break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    // Efficient Approach
    public static int maxEvenOddEff(int arr[]) {
        int res = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
            curr++;
            res = Math.max(res,curr);
            }
            else curr = 1;
        }
        return res;
    }
}
