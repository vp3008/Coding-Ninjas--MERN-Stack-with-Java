/* Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. You can use extra space only O(log n).
Assume BST contains all unique elements.
Note: In a pair, print the smaller element first.
Input format:

Line 1: Elements in the level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Line 2: S

Output format: Each pair in a different line (pair elements separated by space)

Sample Input :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output
2 10
5 7 */

import java.util.*;
public class PairSumInBST {

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


	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		
		if(root==null) {
			return ;
		}
		ArrayList<Integer> arr = convertTreeToArray(root);
		Collections.sort(arr);
		int i=0,j=arr.size()-1;
		while(i<j) {
			
			if(arr.get(i)+ arr.get(j)==sum) {
				System.out.println(arr.get(i) +" " + arr.get(j));
				i++;
				j--;
			}
			else if(arr.get(i) + arr.get(j) < sum ) {
				i++;
			}
			else {
				j--;
			}
			
		}
		
	}

	private static ArrayList<Integer> convertTreeToArray(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return new ArrayList<>();
		}
		
		ArrayList<Integer> leftArrayList = convertTreeToArray(root.left);
		ArrayList<Integer> rightArrayList = convertTreeToArray(root.right);
		ArrayList<Integer> ansArrayList = new ArrayList<>();
		for(int i : leftArrayList) {
			ansArrayList.add(i);
		}
		for(int i : rightArrayList) {
			ansArrayList.add(i);
		}
		ansArrayList.add(root.data);
		return ansArrayList;
		
	}
}