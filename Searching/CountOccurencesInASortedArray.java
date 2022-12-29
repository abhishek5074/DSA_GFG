package Searching;

public class CountOccurencesInASortedArray {

    // Naive Approach
    public static int countOccur(int arr[],int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
        }
        return count;
    }

    // Efficient Approach
    public static int countOccurEff(int arr[],int x){
        int first = IndexOfFirstOccurence.firstOccurEff(arr,x);
        if (first == 0)
            return 0;
        else
            return (IndexOfLastOccurence.lastOccurEff(arr,x) - first + 1);
    }
}
