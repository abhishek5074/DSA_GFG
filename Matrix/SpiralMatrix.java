package Matrix;

public class SpiralMatrix {

    public static void printSpiral(int mat[][]) {
        int top = 0, left = 0, bottom = mat[0].length - 1, right = mat.length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(mat[i][right] + " ");
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.print(mat[top][i] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(mat[bottom][i]);
                    bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top ; i--)
                    System.out.print(mat[i][left]);
                left++;
            }
        }
    }
}
