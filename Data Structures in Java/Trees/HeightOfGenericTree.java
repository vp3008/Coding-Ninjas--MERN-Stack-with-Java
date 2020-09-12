
public class HeightOfGenericTree {

    /*
     * TreeNode structure
     * 
     * class TreeNode<T> { T data; ArrayList<TreeNode<T>> children;
     * 
     * TreeNode(T data){ this.data = data; children = new ArrayList<TreeNode<T>>();
     * } }
     */

    public static int height(TreeNode<Integer> root) {
        if (root == null)
            return 0;

        int max = 1;
        for (TreeNode<Integer> child : root.children) {
            int childHeight = 1 + height(child);
            if (max < childHeight)
                max = childHeight;
        }
        return max;
    }

}
