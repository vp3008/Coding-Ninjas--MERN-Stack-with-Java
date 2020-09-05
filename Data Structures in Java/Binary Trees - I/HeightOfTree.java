/* Given a binary tree, find and return the height of given tree.
Input format :
Nodes in the level order form (separated by space). If any node does not have left or right child, take -1 in its place
Output format :
Height
Constraints :
1 <= N <= 10^5
Sample Input :
10
 9 
4 
-1 
-1 
 5 
 8 
-1 
6 
-1 
-1 
3 
-1 
-1
-1
Sample Output :
5 */

public class HeightOfTree {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */
    public static int height(BinaryTreeNode<Integer> root) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        if (root == null)
            return 0;

        int heightOfTree = Math.max(height(root.left), height(root.right));
        return 1 + heightOfTree;
    }

}
