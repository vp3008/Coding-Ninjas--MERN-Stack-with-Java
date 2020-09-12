/* Given a binary tree and a number k, print out all root to leaf paths where the sum of all nodes value is same as the given number k.
Input format :

Line 1 : Elements in level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Line 2 : k

Output format : Print each path in new line, elements separated by space

Sample Input 1 :
5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
13
Sample Output 1 :
5 6 2
5 7 1 */


public class PathSumRootToLeaf {

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
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
		printPath(root, k , "");
        
	}   
    
    private static void printPath(BinaryTreeNode<Integer> root, int k, String path){
        if(root == null)
            return;
        
    	String num = root.data + "";
        path = path + num + " "; 
        
        if(k-root.data == 0)
            System.out.println(path.trim());
        printPath(root.left, k-root.data, path);
        printPath(root.right, k-root.data, path);
    }
}
