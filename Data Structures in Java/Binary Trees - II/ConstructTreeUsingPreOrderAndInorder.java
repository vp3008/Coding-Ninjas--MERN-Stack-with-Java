/* Given Preorder and Inorder traversal of a binary tree, create the binary tree associated with the traversals.You just need to construct the tree and return the root.
Note: Assume binary tree contains only unique elements.
Input format :

Line 1 : n (Total number of nodes in binary tree)

Line 2 : Pre order traversal

Line 3 : Inorder Traversal

Output Format :

Elements are printed level wise, each level in new line (separated by space).

Sample Input :
12
1 2 3 4 15 5 6 7 8 10 9 12
4 15 3 2 5 1 6 10 8 7 9 12
Sample Output :
1 
2 6 
3 5 7 
4 8 9 
15 10 12
 */
public class ConstructTreeUsingPreOrderAndInorder {
    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in) {

        // Write your code here
        return createBinaryTree(pre, in, 0, pre.length - 1, 0, in.length - 1);

    }

    private static BinaryTreeNode<Integer> createBinaryTree(int[] pre, int[] in, int preStart, int preEnd, int inStart,
            int inEnd) {
        if (inStart > inEnd || preStart > preEnd)
            return null;

        int data = pre[preStart];
        int mid = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == data) {
                mid = i;
                break;
            }
        }

        int leftPreStart = preStart + 1;
        int leftPreEnd = leftPreStart + mid - inStart - 1;
        int leftInStart = inStart;
        int leftInEnd = mid - 1;

        int rightPreStart = leftPreEnd + 1;
        int rightPreEnd = preEnd;
        int rightInStart = mid + 1;
        int rightInEnd = inEnd;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preStart]);
        root.left = createBinaryTree(pre, in, leftPreStart, leftPreEnd, leftInStart, leftInEnd);
        root.right = createBinaryTree(pre, in, rightPreStart, rightPreEnd, rightInStart, rightInEnd);
        return root;
    }

}
