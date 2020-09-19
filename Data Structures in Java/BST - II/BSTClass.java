/* Implement the BST class which includes following functions -
1. search
Given an element, find if that is present in BSt or not. Return true or false.
2. insert -
Given an element, insert that element in the BST at the correct position. Assume unique elements will be given.
3. delete -
Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.
4. printTree (recursive) -
Print the BST in ithe following format -
For printing a node with data N, you need to follow the exact format -
N:L:x,R:y
wherer, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.
There is no space in between.
You need to print all nodes in the recursive format in different lines.
Note : main function is given for your reference which we are using internally to test the class. */

/***************
 * BinaryTreeNode class already given - 
 * 
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
***************/

/**************
 * Main function that we are using internally
 * 
 * public static void main(String[] args) { BinarySearchTree bst = new
 * BinarySearchTree(); int choice, input; while(true) { choice = s.nextInt();
 * switch(choice) { case 1 : input = s.nextInt(); bst.insertData(input); break;
 * case 2 : input = s.nextInt(); bst.deleteData(input); break; case 3 : input =
 * s.nextInt(); System.out.println(bst.search(input)); break; default :
 * bst.printTree(); return; }
 * 
 * }
 *******************/

public class BinarySearchTree {
    // Complete this class
    BinaryTreeNode<Integer> root = null;
    int size = 0;

    public boolean search(int x) {
        return isPresentHelper(root, x);
    }

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
        if (node == null)
            return false;

        if (node.data == x)
            return true;

        else if (node.data > x)
            return isPresentHelper(node.left, x);
        else
            return isPresentHelper(node.right, x);
    }

    public void insertData(int x) {
        root = insertHelper(root, x);
    }

    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            root = new BinaryTreeNode<Integer>(x);
            return root;
        }

        if (x > root.data)
            root.right = insertHelper(root.right, x);
        else if (x < root.data)
            root.left = insertHelper(root.left, x);
        return root;
    }

    public void deleteData(int data) {
        root = delete(root, data);
    }

    public BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root, int data) {

        if (root == null) {
            return null;
        }
        if (root.data == data) {

            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {

                return root.right;

            } else if (root.right == null) {
                return root.left;
            } else {

                // inorder succeesor i.e. Right Subtree Min

                BinaryTreeNode<Integer> temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                int tempData = temp.data;
                root.data = tempData;
                root.right = delete(root.right, tempData);
                return root;
            }

        }

        if (data < root.data) {

            root.left = delete(root.left, data);

        } else {
            root.right = delete(root.right, data);
        }
        return root;

    }

    private int minValue(BinaryTreeNode<Integer> root) {
        int minV = root.data;
        while (root.left != null) {
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }

    public void printTree() {
        printTree(root);
    }

    public void printTree(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L:" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R:" + root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }

}
