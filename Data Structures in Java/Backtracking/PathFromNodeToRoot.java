/* Given a BST and an integer k. Find and return the path from the node with data k and root (if a node with data k is present in given BST). Return null otherwise.
Assume that BST contains all unique elements.
Input Format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer k
Output Format :
Path from node k to root
Sample Input :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output :
2
5
8 */

import java.util.*;

public class PathFromNodeToRoot {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */
    public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return null;

        if (root.data == data) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        else if (root.data > data) {
            ArrayList<Integer> leftOutput = findPath(root.left, data);
            if (leftOutput != null)
                leftOutput.add(root.data);
            return leftOutput;
        } else {
            ArrayList<Integer> rightOutput = findPath(root.right, data);
            if (rightOutput != null)
                rightOutput.add(root.data);
            return rightOutput;
        }
    }
}