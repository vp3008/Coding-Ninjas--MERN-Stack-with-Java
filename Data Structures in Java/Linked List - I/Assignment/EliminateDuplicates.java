/* 
You have been given a singly linked list of integers where the elements are sorted in ascending order. Write a function that removes the consecutive duplicate values such that the given list only contains unique elements and returns the head to the updated list.
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

/* Sample Input 1 :
1
1 2 3 3 4 3 4 5 4 5 5 7 -1
Sample Output 1 :
1 2 3 4 3 4 5 4 5 7 
Sample Input 2 :
2
10 20 30 40 50 -1
10 10 10 10 -1
Sample Output 2 :
10 20 30 40 50
10 */

public class EliminateDuplicates {
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        // Your code goes here
        LinkedListNode<Integer> curr = head;
        while (curr != null && curr.next != null) {

            if (curr.data.equals(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}