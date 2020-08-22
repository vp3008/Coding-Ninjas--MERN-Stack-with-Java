/* You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'
 Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
Note :
Assume that the Indexing for the singly linked list always starts from 0.

If the position is greater than the length of the singly linked list, you should return the same linked list without any change.
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 100
Sample Output 1 :
3 4 5 100 2 6 1 9
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0 20
10 98 7 66 8 -1
5 99
Sample Output 2 :
20 3 4 5 2 6 1 9
10 98 7 66 8 99  */

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

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data) {
        // Your code goes here
        /* Empty list */
        if (head == null)
            return head;

        /* entered position is 0, insert at head */
        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            newNode.next = head;
            return newNode;
        }
        ;

        int count = 0;
        int length = 1;
        LinkedListNode cur = head;
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);

        /* calculating length + traversing to end of list */
        while (cur.next != null) {
            cur = cur.next;
            length++;
        }

        /* if entered position is greater than list length */
        if (pos > length)
            return head;

        /* if last position is entered */
        if (pos == length) {
            cur.next = newNode;
            return head;
        }

        /* traverse to the node where insertion is to take place */
        cur = head;
        while (pos > 1) {
            cur = cur.next;
            pos--;
        }
        /* insert the new node */
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }
}