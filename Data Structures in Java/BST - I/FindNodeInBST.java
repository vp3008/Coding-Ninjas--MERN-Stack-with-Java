public class Solution {

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

	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){
		if(root == null)
            return null;
        
        if(k < root.data)
            return searchInBST(root.left, k);
        else if(k > root.data)
           return searchInBST(root.right, k);
        else
            return root;
	}
}