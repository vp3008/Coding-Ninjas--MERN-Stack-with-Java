/* You are given a N*N maze with a rat placed at maze[0][0]. Find and print all paths that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
Input Format
Line 1 : Integer N
Next N Lines : Each line will contain ith row elements (separated by space)
Output Format :
One Line for every possible solution. 
Every line will have N*N maze elements printed row wise and are separated by space. Only cells that are part of solution path should be 1, rest all cells should be 0.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
1 0 0 1 0 0 1 1 1 
Sample Output 1 Explanation :
Only 1 path is possible
Sample Input 2 :
3
1 0 1
1 1 1
1 1 1
Sample Output 2 :
1 0 0 1 1 1 1 1 1 
1 0 0 1 0 0 1 1 1 
1 0 0 1 1 0 0 1 1 
1 0 0 1 1 1 0 0 1 
Sample Output 2 Explanation :
4 paths are possible */



public class Solution {
	public static void ratInAMaze(int maze[][]){
		int n = maze.length;
        int path[][] = new int[n][n];
        solveMaze(maze, 0, 0, path);	
	}
    
    private static void solveMaze(int[][] maze, int i, int j, int path[][]){
        int n = maze.length;
        if(i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return;
        }
        path[i][j] = 1;
        if(i == n-1 && j == n-1){
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    System.out.print(path[r][c] + " ");
                }
            }
            System.out.println();
            /*reset the objective square back to 0 for the next step*/
            path[i][j] = 0;
            return;
        }
        
        solveMaze(maze, i-1, j, path);
        solveMaze(maze, i, j-1, path);
        solveMaze(maze, i+1, j, path);
        solveMaze(maze, i, j+1, path);
        /* reset all the steps back to 0 during return for the next path */
        path[i][j] = 0;       
    }
}
