/* For a given singly linked list of integers, find and return its length. Do it using an iterative method.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains elements of the singly linked list separated by a single space. 
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the length of the linked list.

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
Sample Output 1 :
7
Sample Input 2 :
2
10 76 39 -3 2 9 -23 9 -1
-1
Sample Output 2 :
8
0*/

public class LengthOfLinkedList {

    public static int length(LinkedListNode<Integer> head) {
        // Your code goes here
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}