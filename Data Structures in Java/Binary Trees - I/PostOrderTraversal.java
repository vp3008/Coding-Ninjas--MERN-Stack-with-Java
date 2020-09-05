/* Given a binary tree, print the postorder traversal of given tree.
Post-order traversal is: LeftChild RightChild Root
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Post-order traversal, elements separated by space
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output :
1 4 7 6 3 13 14 10 8 */

public class PostOrderTraversal {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */
    public static void postOrder(BinaryTreeNode<Integer> root) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Print output and don't return it. Taking
         * input is handled automatically.
         */
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

}
