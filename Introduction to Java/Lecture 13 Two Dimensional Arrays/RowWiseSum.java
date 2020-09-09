
public class RowWiseSum {

    public static void rowWiseSum(int[][] mat) {
        // Your code goes here

        int m = mat.length;
        if (m == 0) {
            // System.out.println(0);
            return;
        }
        int n = mat[0].length;

        int rowSum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }
            System.out.print(rowSum + " ");
            rowSum = 0;
        }
    }

}