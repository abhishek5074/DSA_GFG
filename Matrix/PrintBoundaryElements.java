package Matrix;

public class PrintBoundaryElements {

    public static void bTraversal(int arr[][]){

        if (arr.length == 1){
            for (int i = 0; i < arr[0].length; i++)
                System.out.print(arr[0][i] + " ");
            }
        else if (arr[0].length == 1){
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i][0] + " ");
            }
        else {
            for (int i = 0; i < arr[0].length; i++)
                System.out.print(arr[0][i] + " ");
            for (int i = 1; i < arr.length; i++)
                System.out.print(arr[i][arr[0].length-1] + " ");
            for (int i = arr[0].length-2; i >= 0; i--)
                System.out.print(arr[arr.length-1][i] + " ");
            for (int i = arr.length-2; i > 0 ; i--)
                System.out.print(arr[i][0] + " ");
        }
    }
}
