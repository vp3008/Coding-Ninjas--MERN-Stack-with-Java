/* Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.
Input format :

Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.

Output format : Each level linked list is printed in new line (elements separated by space).

Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output :
5 
6 10 
2 3 
9 */

import java.util.*;


public class LevelWiseLinkedList {

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

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		// Write your code here
        ArrayList<Node<BinaryTreeNode<Integer>>> list = new ArrayList<>();
        return LLForEachLeve(root, list);
	}
    
    private static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLeve(BinaryTreeNode<Integer> root, ArrayList<Node<BinaryTreeNode<Integer>>> list)
    {
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        Node head = null, tail = null;
        while(!q.isEmpty())
        {
            BinaryTreeNode<Integer> node = q.poll();
            if(node != null){
                if(head == null){
                    head = new Node(node);
                    tail = head;
                }
                else{
                    tail.next = new Node(node);
                    tail = tail.next;
                }
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            else{
            	list.add(head);
                head = null;
                tail = null;
                if(!q.isEmpty())
                    q.add(null);
            }
        }
        return list;
    }


}
