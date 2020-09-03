/* Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
You need to find and return that number which is unique in the array.
Note : Given array will always contain odd number of elements.
Input format :
Line 1 : Array size i.e. 2N+1
Line 2 : Array elements (separated by space)
Output Format :
Unique element present in the array
Constraints :
1 <= N <= 10^6
Sample Input :
7
2 3 1 6 3 6 2
Sample Output :
1 */

import java.util.Arrays;

public class FindUnique {

    public static int findUnique(int[] arr) {

        int i = 0;
        Arrays.sort(arr);
        for (i = 0; i < arr.length - 2; i = i + 2) {
            if (arr[i] != arr[i + 1])
                break;
        }
        return arr[i];
    }
}