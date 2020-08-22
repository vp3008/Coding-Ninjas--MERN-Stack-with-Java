/* You have been given a singly linked list of integers. Write a function that returns the index/position of an integer data denoted by 'N' (if it exists). Return -1 otherwise.
Note :
Assume that the Indexing for the singly linked list always starts from 0. */

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

public class Solution {

    public static int findNode(LinkedListNode<Integer> head, int n) {
        // Your code goes here
        if (head == null)
            return -1;
        int pos = 0;
        while (head != null) {
            if (head.data == n)
                return pos;
            head = head.next;
            pos++;
        }

        return -1;
    }
}