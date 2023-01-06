package Searching;

public class AllocateMinimumPages {

    public static int sum(int arr[], int b, int e){
        int s = 0;
        for (int i = b; i <= e; i++)
            s+=arr[i];
        return s;
    }

    public static int minPages(int arr[], int n,int k){
        if (k == 1) return sum(arr,0,arr.length-1);
        if (n == 1) return arr[0];
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res = Math.min(res,Math.max(minPages(arr,i,k-1),sum(arr,i,n-1)));
        }
        return res;
    }

    public static boolean isFeasible(int arr[], int n, int k, int ans){
        int req = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > ans){
                req++;
                sum = arr[i];
            }
            else
                sum +=arr[i];
        }
        return (req <= k);
    }

    public static int minPagesEff(int arr[], int n, int k){
        int sum = 0, mx = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int low = mx, high = sum, res = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if (isFeasible(arr,n,k,mid)){
                res = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return res;
    }
}
