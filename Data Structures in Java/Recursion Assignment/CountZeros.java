/* Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
10204
Sample Output 1 :
2
Sample Input 2 :
708000
Sample Output 2 :
4 */

public class CountZeros {

    public static int countZerosRec(int input) {
        // Write your code here
        if (input == 0)
            return 0;
        if (input % 10 == 0)
            return 1 + countZerosRec(input / 10);
        else
            return countZerosRec(input / 10);
    }
}
