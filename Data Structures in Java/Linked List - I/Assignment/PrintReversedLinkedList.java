/* You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
Note :
You can’t change any of the pointers in the linked list, just print it in the reverse order. */

/*
	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class PrintReversedLinkedList {
    public static void printReverse(LinkedListNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return;

        LinkedListNode prev = null;
        LinkedListNode cur = root;
        LinkedListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        root = prev;

        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
    }

}