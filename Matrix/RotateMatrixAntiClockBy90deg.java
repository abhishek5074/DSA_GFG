package Matrix;

import Utilities.Swap;

public class RotateMatrixAntiClockBy90deg {

    public static void rotate90(int mat[][]){
        int temp[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                temp[mat.length - j - 1][i] = mat[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = temp[i][j];
            }
        }
    }

    public static void rotate90Eff(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[0].length; j++) {
                Swap.swap(mat[i][j],mat[j][i]);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int low = 0, high = mat[0].length - 1;
            while(low < high){
                Swap.swap(mat[low][i],mat[high][i]);
                low++;
                high--;
            }
        }
    }
}
