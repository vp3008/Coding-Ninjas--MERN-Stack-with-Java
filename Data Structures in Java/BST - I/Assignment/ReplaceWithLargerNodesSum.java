 class Sum
    {
    	int sum = 0;
	}
public class ReplaceWithLargerNodesSum {

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
   
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        Sum s = new Sum();
		replace(root, s);   
	}
    
    private static void replace(BinaryTreeNode<Integer> node, Sum S){
       // Base Case 
        if (node == null) 
            return; 
  
        // Recur for right subtree 
        replace(node.right, S); 
  
        // Now *sum has sum of nodes in right subtree, add 
        // root->data to sum and update root->data 
        S.sum = S.sum + node.data; 
        node.data = S.sum; 
  
        // Recur for left subtree 
        replace(node.left, S); 
    }
}

