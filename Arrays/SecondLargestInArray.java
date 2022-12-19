package Arrays;

public class SecondLargestInArray {
    // Naive Approach
    public static int getSecondLargest(int arr[]) {
        int largest = LargestElementInArray.getLargestEff(arr);
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[largest]){
                if(res == -1)
                    res = i;
                else if(arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }


    // Efficient Approach
    public static int getSecondLargestEff(int arr[]) {
        int largest = 0, res = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if (res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }
}
