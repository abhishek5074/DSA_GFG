package Arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    // Naive Approach
    public static void moveZeroes(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] != 0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    // Efficient Approach
    public static void moveZeroesEff(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }
}
