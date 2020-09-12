
public class PostOrderTraversalGenericTree {

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

	public static void postOrder(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
        if(root == null)
            return;
        
        for(TreeNode<Integer> child : root.children)
            postOrder(child);
        
        System.out.print(root.data+" ");
	}

}
