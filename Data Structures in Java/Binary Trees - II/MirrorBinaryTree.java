/* Mirror the given binary tree. That is, right child of every nodes should become left and left should become right.


Note : You don't need to print or return the tree, just mirror it.
Input format :

Line 1 : Elements in level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Output format : Elements in level order form (Every level in new line)

Sample Input 1:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
1 
3 2 
7 6 5 4
Sample Input 2:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 2:
5 
6 10 
3 2 
9 */

public class MirrorBinaryTree {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static void mirror(BinaryTreeNode<Integer> root) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. No need to print or return the output. Taking
         * input and printing output is handled automatically.
         */
        if (root == null)
            return;

        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode<Integer> tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
    }

}