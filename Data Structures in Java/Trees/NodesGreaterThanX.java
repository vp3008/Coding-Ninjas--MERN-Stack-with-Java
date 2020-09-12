public class NodesGreaterThanX {

    /*
     * TreeNode class
     * 
     * class TreeNode<T> { T data; ArrayList<TreeNode<T>> children;
     * 
     * TreeNode(T data){ this.data = data; children = new ArrayList<TreeNode<T>>();
     * } }
     */

    public static int numNodeGreater(TreeNode<Integer> root, int x) {

        // Write your code here
        if (root == null)
            return 0;

        int count = 0;
        if (root.data > x)
            count++;
        for (TreeNode<Integer> child : root.children)
            count += numNodeGreater(child, x);

        return count;
    }}

    
    
    
    
    
    
    
    
    

    