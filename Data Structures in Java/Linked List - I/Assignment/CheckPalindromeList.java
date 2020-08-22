public class CheckPalindromeList {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        // Your code goes here
        if (head == null)
            return true;

        LinkedListNode cur = head;
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        /* finding mid point of the list */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /* if list length is odd */
        if (fast != null)
            slow = slow.next;

        /* reversing the 2nd half */
        slow = reverse(slow);
        fast = head;

        /* comparing the two lists */
        while (slow != null) {
            if (slow.data != fast.data) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        if (head == null)
            return head;

        LinkedListNode cur = head;
        LinkedListNode prev = null;
        LinkedListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}