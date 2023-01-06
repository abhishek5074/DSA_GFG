package Searching;

public class TripletInASortedArray {

    public static boolean isTriplet(int arr[],int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k =j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==x)
                        return true;
                }
            }
        }
        return false;
    }

    static boolean isPair(int arr[],int x, int si){
        int i = si, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x)
                return true;
            else if (arr[i] + arr[j] < x)
                i++;
            else
                j--;
        }
        return false;
    }

    public static boolean isTripletEff(int arr[], int x){
        for (int i = 0; i < arr.length - 2; i++) {
            if (isPair(arr,x-arr[i],i+1))
                return true;
        }
        return false;
    }
}
