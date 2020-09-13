
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
   
    public static int replaceWithLargerNodesSum (BinaryTreeNode<Integer> root, int sum){
        if(root == null)
            return sum;
        sum = replaceWithLargerNodesSum(root.right, sum);
        sum += root.data;
        root.data = sum;
        sum = replaceWithLargerNodesSum(root.left, sum);
        return sum;
    }
    
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root){
        int sum = 0;
        replaceWithLargerNodesSum(root, sum);
    }
}

