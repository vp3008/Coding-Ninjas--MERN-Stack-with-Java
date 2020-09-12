/* Given a binary tree, print the level order traversal. Make sure each level start in new line.
Input format :

Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.

Output Format :

Elements are printed level wise, each level in new line (separated by space).

Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output :
5 
6 10 
2 3 
9 */

import java.util.ArrayList;
import java.util.*;

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

	public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        if(root == null)
            return;
        q.add(root);
        q.add(null);
		
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> node = q.poll();
            if(node != null){
                System.out.print(node.data + " ");
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            else{
                System.out.println();
                if(!q.isEmpty())
                    q.add(null);
            }
        }

	}
}
