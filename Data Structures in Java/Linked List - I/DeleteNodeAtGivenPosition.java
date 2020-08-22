/* You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'pos'.
Note :
Assume that the Indexing for the linked list always starts from 0.

If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.
*/

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

    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {

        /* Empty list */
        if (head == null)
            return head;

        /* when position is 0 meaning delete from head */
        if (pos == 0)
            return head.next;

        LinkedListNode cur = head;
        while (pos > 1) {
            if (cur == null)
                return head;

            cur = cur.next;
            pos--;
        }

        /* /if last node is to be deleted */
        if (cur.next == null) {
            cur = null;
            return head;
        }

        /* normal deletion */
        cur.next = cur.next.next;
        return head;

    }
}