/* Given a binary tree, find and return the min and max data value of given binary tree.
Return the output as an object of PairAns class, which is already created.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Max and min (separated by space)
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output :
14 1 */


public class MinAndMax {

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

	PairAns class - 
	class PairAns {
		int min;
		int max;
	}

	 */
	public static PairAns minMax(BinaryTreeNode<Integer> root) {
		PairAns pair = new PairAns();
        pair.min = findMin(root);
        pair.max = findMax(root);
        return pair;
	}
    
    private static int findMin(BinaryTreeNode<Integer> root){
        if(root == null)
            return Integer.MAX_VALUE;
        
        int data = root.data;
        int lMin = findMin(root.left);
        int rMin = findMin(root.right);
        
        if(lMin < data)
            data = lMin;
        if(rMin < data)
            data = rMin;
        return data;
    }
    
    private static int findMax(BinaryTreeNode<Integer> root){
        if(root == null)
            return Integer.MIN_VALUE;
        
        int data = root.data;
        int lMax = findMax(root.left);
        int rMax = findMax(root.right);
        
        if(lMax > data)
            data = lMax;
        if(rMax > data)
            data = rMax;
        return data;
    }

}
