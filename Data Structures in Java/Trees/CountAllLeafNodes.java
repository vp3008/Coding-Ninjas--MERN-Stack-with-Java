public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
		if(root == null)
            return 0;
        
        int count = 0;
        if(root.children.size() == 0)
            count++;
        for(TreeNode<Integer> child : root.children)
            count += countLeafNodes(child);
        return count;
	}
	
}
