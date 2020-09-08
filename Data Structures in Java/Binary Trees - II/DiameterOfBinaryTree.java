/* Given a Binary Tree, find and return the diameter of input binary tree.
Diameter is - largest count of nodes between any two leaf nodes in the binary tree (both the leaf nodes are inclusive).
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
diameter
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output :
7 */

import java.lang.Math;

public class DiameterOfBinaryTree {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        if (root == null)
            return 0;

        int option1 = diameterOfBinaryTree(root.left);
        int option2 = diameterOfBinaryTree(root.right);
        int option3 = findMAxSubtreeHeight(root.left) + findMAxSubtreeHeight(root.right) + 1;
        return Math.max(option3, Math.max(option1, option2));
    }

    private static int findMAxSubtreeHeight(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int right = 1 + findMAxSubtreeHeight(root.right);
        int left = 1 + findMAxSubtreeHeight(root.left);
        return Math.max(right, left);
    }
}
