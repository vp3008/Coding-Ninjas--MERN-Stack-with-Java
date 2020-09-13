public class LowestCommonAncestorInBSR {

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

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here
		if(root == null)
            return 0;
        
        if(a < root.data && b < root.data)
            return lcaInBST(root.left, a, b);
        else if(a > root.data && b > root.data)
            return lcaInBST(root.right, a, b);
        else
            return root.data;
	}
}