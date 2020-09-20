/* Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree.
Return the height of largest BST.
Input format :

Line 1 : Elements in level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
2 */


import java.lang.Math;
public class LargestBSTInefficient {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
    }
*/
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return height(root);
        
        else{
    		int lHeight = largestBSTSubtree(root.left);
            int rHeight = largestBSTSubtree(root.right);
            return Math.max(lHeight, rHeight);
        } 
	}
    
    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max){
        if(root == null)
            return true;
        
        if(root.data < min || root.data > max)
            return false;
        
        boolean isLeftBST = isBST(root.left, min, root.data - 1);
        boolean isRightBST = isBST(root.right, root.data, max);
        
        return isLeftBST && isRightBST;
    }
    
    private static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
