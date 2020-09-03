/* Given an integer array A of size N, check if the input array can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.
Groups can be made with any set of elements, i.e. elements need not to be continuous. And you need to consider each and every element of input array in some group.
Return true, if array can be split according to the above rules, else return false.
Note : You will get marks only if all the test cases are passed.
Input Format :
Line 1 : Integer N (size of array)
Line 2 : Array A elements (separated by space)
Output Format :
true or false
Constraints :
1 <= N <= 50
Sample Input 1 :
2
1 2
Sample Output 1 :
false
Sample Input 2 :
3
1 4 3
Sample Output 2 :
true */

import java.util.*;

public class SplitArray {

    public static boolean splitArray(int input[]) {
        /*
         * Your class should be named solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        return splitArray(input, 0, input.length - 1, 0, 0);
    }

    public static boolean splitArray(int[] arr, int start, int end, int lSum, int rSum) {

        if (start > end) {

            return lSum == rSum;

        }
        if (arr[start] % 5 == 0) {
            return splitArray(arr, start + 1, end, lSum + arr[start], rSum);
        } else if (arr[start] % 3 == 0) {
            return splitArray(arr, start + 1, end, lSum, rSum + arr[start]);
        } else {
            return splitArray(arr, start + 1, end, lSum + arr[start], rSum)
                    || splitArray(arr, start + 1, end, lSum, rSum + arr[start]);
        }
    }
}
