package Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int arr[] = {2,8,3,9,6,5,4};

        System.out.println(getSum(arr,1,3));

        int ps[] = new int[arr.length];
        ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i-1] + arr[i];
        }
        System.out.println(getSumEff(ps,1,3));
    }

    // Given a fixed array and multiple range sum queries, how to answer the queries efficiently
    public static int getSum(int arr[],int l, int r){
        int res = 0;
        for (int i = l; i <= r; i++) {
            res+=arr[i];
        }
        return res;
    }

    public static int getSumEff(int arr[], int l, int r){
        return l == 0 ? arr[r] : arr[r] - arr[l-1];
    }
}
