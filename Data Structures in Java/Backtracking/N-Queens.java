/* ou are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board. A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to print all such configurations.
Input Format :
Line 1 : Integer N
Output Format :
One Line for every board configuration. 
Every line will have N*N board elements printed row wise and are separated by space
Note : Don't print anything if there isn't any valid configuration.
Constraints :
1<=N<=10
Sample Input 1:
4
Sample Output 1 :
0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0 
0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0  */


public class N-Queens {
	
		
public static void placeNQueens(int n){
		int[][] board = new int[n][n];
		placeQueen(board, 0);
	}
    
    private static void placeQueen(int[][] board, int row){
        int n = board.length;
        if(row == n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
            return ;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 1;
                placeQueen(board, row+1);
                board[row][i] = 0;
            }
        }
    }
    
    private static boolean isSafe(int[][] board, int row, int col){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    if(i == row || j == col)
                        return false;
                    if((i-j) == (row-col) || (i+j) == (row+col))
                        return false;
                }
            }
        }
        return true;
    }
	
}
