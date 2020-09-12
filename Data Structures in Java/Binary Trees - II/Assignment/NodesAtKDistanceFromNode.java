/* Given a binary tree, a node and an integer K, print nodes which are at K distance from the the given node.
Input format :

Line 1 : Elements in level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Line 2 : Node

Line 3 : K

Output format : Answer nodes in different line

Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
3
1
Sample Output :
9
6
 */

 public class NodesAtKDistanceFromNode {

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
	
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		// Write your code here
		printKDistanceNode(root, node, k);
        
	}
    
    private static void printKDistanceFromRoot(BinaryTreeNode<Integer> node, int k){
        if(node == null || k<0)
            return;
        
        if(k == 0){
            System.out.println(node.data);
            return;
        }   
        printKDistanceFromRoot(node.left, k-1);
        printKDistanceFromRoot(node.right, k-1);
    }
    
    private static int printKDistanceNode(BinaryTreeNode<Integer> root, int node, int k)
    {
        if(root == null)
            return -1;
        
        if(root.data == node){
            printKDistanceFromRoot(root, k);
            return 0;
        }
        int dl = printKDistanceNode(root.left, node, k);
        if(dl != -1){
            if(dl+1 == k)
                System.out.println(root.data);
            else
            	printKDistanceFromRoot(root.right, k-dl-2);
            return 1+dl;
        }
        
        int rd = printKDistanceNode(root.right, node, k);
        if(rd != -1){
            if(rd + 1 == k)
                System.out.println(root.data);
            else
                printKDistanceFromRoot(root.left, k-rd-2);
            return 1 + rd;
        }
        return -1;
    }
}
