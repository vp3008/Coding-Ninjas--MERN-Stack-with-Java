public class SortedArrayToBST {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr) {
        if (arr.length == 0)
            return null;

        return convertToBST(arr, 0, arr.length - 1);
    }

    private static BinaryTreeNode<Integer> convertToBST(int[] arr, int left, int right) {
        if (left > right)
            return null;

        int mid = left + (right - left) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = convertToBST(arr, left, mid - 1);
        root.right = convertToBST(arr, mid + 1, right);
        return root;
    }
}