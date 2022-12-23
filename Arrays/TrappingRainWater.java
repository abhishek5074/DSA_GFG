package Arrays;

public class TrappingRainWater {
    // Naive Approach
    public static int getWater(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res += (Math.min(lMax, rMax) - arr[i]);
        }
        return res;
    }

    // Efficient Approach
    public static int getWaterEff(int arr[]) {
        int res = 0;
        int lMax[] = new int[arr.length], rMax[] = new int[arr.length];

        lMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }

        rMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], arr[i]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            res += (Math.min(lMax[i], rMax[i]) - arr[i]);
        }
        return res;
    }
}
