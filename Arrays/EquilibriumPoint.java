package Arrays;

public class EquilibriumPoint {

    // Naive Approach
    public static boolean ePoint(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int ls = 0, rs = 0;
            for (int j = 0; j < i; j++)
                ls += arr[j];
            for (int j = i + 1; j < arr.length; j++)
                rs += arr[j];
            if (ls == rs)
                return true;
        }
        return false;
    }

    // Efficient Approach
    public static boolean ePointEff(int arr[]){
        int rs = 0;
        for (int i = 0; i < arr.length; i++)
            rs += arr[i];
        int ls = 0;
        for (int i = 0; i < arr.length; i++){
            rs -= arr[i];
            if (ls == rs)
                return true;
            ls += arr[i];
        }
        return false;
    }

}
