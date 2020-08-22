/* You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
 Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
Sample Input 2 :
1
10 6 77 90 61 67 100  -1
4
Sample Output 2 :
90 61 67 100 10 6 77 */

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
public class AppendLastNToFirst {

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        // Your code goes here
        if (head == null || n == 0)
            return head;

        LinkedListNode cur = head;
        int length = 1;
        while (cur.next != null) {
            cur = cur.next;
            length++;
        }

        if (n > length)
            return head;

        LinkedListNode temp = head;
        int count = 0;
        while (count < length - n - 1) {
            temp = temp.next;
            count++;
        }
        LinkedListNode newHead = temp.next;
        temp.next = null;
        cur.next = head;
        return newHead;
    }

}