/* Given a binary tree, print the preorder traversal of given tree.
Pre-order traversal is: Root LeftChild RightChild
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Pre-order traversal, elements separated by space
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output :
8 3 1 6 4 7 10 14 13 */

public class PreOrderTraversal {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */
    public static void preOrder(BinaryTreeNode<Integer> root) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Print output and don't return it. Taking
         * input is handled automatically.
         */
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

}
