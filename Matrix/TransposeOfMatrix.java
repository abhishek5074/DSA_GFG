package Matrix;

public class TransposeOfMatrix {

    // Naive Approach
    public static void transpose(int mat[][]){
        int temp[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                temp[i][j] = mat[j][i];

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                mat[i][j] = temp[i][j];
    }

    // Efficient Approach
    public static void transposeEff(int mat[][]){
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
    }

}
