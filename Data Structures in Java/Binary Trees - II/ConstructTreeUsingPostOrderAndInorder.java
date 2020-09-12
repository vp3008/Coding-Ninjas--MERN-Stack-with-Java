/* Given Postorder and Inorder traversal of a binary tree, create the binary tree associated with the traversals.You just need to construct the tree and return the root.
Note: Assume binary tree contains only unique elements.
Input format :

Line 1 : n (Total number of nodes in binary tree)

Line 2 : Post order traversal

Line 3 : Inorder Traversal

Output Format :

Elements are printed level wise, each level in new line (separated by space).

Sample Input :
8
8 4 5 2 6 7 3 1
4 8 2 5 1 6 3 7
Sample Output :
1 
2 3 
4 5 6 7 
8 */


public class ConstructTreeUsingPostOrderAndInorder {

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

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in){
		
			// Write your code here	
        return createBinaryTree(post, in, 0, post.length -1, 0, in.length-1);
		
	}
    
    private static BinaryTreeNode<Integer> createBinaryTree(int[] post, int[] in, int postStart, int postEnd, int inStart, int inEnd){
        
        if(postStart > postEnd || inStart > inEnd)
            return null;
        
        int data = post[postEnd];
        int mid = 0;
        for(int i=inStart; i<=inEnd; i++){
            if(in[i] == data){
                mid = i;
                break;
            }
        }
        
        int rightInStart = mid + 1;
        int rightInEnd = inEnd;
        
        int leftInStart = inStart;
        int leftInEnd = mid - 1;
        
        int leftPostStart = postStart;
        int leftPostEnd = postStart + mid - 1 -inStart;
        
        int rightPostStart = leftPostEnd + 1;
        int rightPostEnd = postEnd -1;
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left = createBinaryTree(post, in, leftPostStart, leftPostEnd, leftInStart, leftInEnd);
        root.right = createBinaryTree(post, in, rightPostStart, rightPostEnd, rightInStart, rightInEnd);
        
        return root;
    }
}
