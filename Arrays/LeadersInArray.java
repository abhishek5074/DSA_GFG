package Arrays;

public class LeadersInArray {
    // Naive Approach
    public static void leaders(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                System.out.print(arr[i] + " ");
        }
    }

    // Efficient Approach
    public static void leadersEff(int arr[]) {
        int curr_ldr = arr[arr.length - 1];
        System.out.print(curr_ldr + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > curr_ldr) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }
}
