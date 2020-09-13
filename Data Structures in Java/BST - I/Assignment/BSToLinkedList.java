class PairLinkedList{
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;
    }
public class BSTToLinkedList {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

/* LinkedList Node Class
*
*	
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/
    
    
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		
        return helper(root).head;
		
	}
    
    private static PairLinkedList helper(BinaryTreeNode<Integer> root){
        if(root == null){
            PairLinkedList pair = new PairLinkedList();
            pair.head = null;
            pair.tail = null;
            return pair;
        }
        
        LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(root.data);
        PairLinkedList leftTree = helper(root.left);//get left tree
        PairLinkedList rightTree = helper(root.right);//get right tree
        PairLinkedList pair = new PairLinkedList();
        
        /*attach left tree to root and root to right tree*/
        
        //if left is not null attach root to right and return
        if(leftTree.head != null){
            pair.head = leftTree.head;
            pair.tail = leftTree.tail;
            pair.tail.next = newHead;
            pair.tail = newHead;
            if(rightTree.head == null){//if right is null, return
                pair.tail.next = null;
                return pair;
            }
        }
        //attach right tree to root
        if(rightTree.head != null && leftTree.head != null){
            pair.tail.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if left is null just attach right to root and return
        if(rightTree.head != null && leftTree.head == null){
            pair.head = newHead;
            newHead.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if both are null, simply return the current node
        else{
            pair.head = newHead;
            pair.tail = newHead;
        }
        return pair;
    }
    
    
}	