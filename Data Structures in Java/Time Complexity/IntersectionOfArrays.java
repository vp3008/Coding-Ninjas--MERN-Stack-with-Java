/* Given two random integer arrays, print their intersection. That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.
Note : Order of elements are not important
Input format :
Line 1 : Integer N, Array 1 Size
Line 2 : Array 1 elements (separated by space)
Line 3 : Integer M, Array 2 Size
Line 4 : Array 2 elements (separated by space)
Output format :
Print intersection elements in different lines
Constraints :
0 <= M, N <= 5 * 10^7
Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7 
Sample Output 1 :
2 
4 
3
Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 
2
1 */

import java.util.Arrays;

public class IntersectionOfArrays {

    public static void intersection(int[] arr1, int[] arr2) {
        /*
         * Your class should be named Intersection Don't write main(). Don't read input,
         * it is passed as function argument. Print output and don't return it. Taking
         * input is handled automatically.
         */
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;

        while (i < n && j < m) {

            if (arr1[i] > arr2[j]) {
                j++;
            }

            else if (arr2[j] > arr1[i]) {
                i++;
            } else {
                // when both are equal
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}