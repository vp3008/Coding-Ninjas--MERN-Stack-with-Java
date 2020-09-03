/* Given a random integer array A and a number x. Find and print the pair of elements in the array which sum to x.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, 5) print "5 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.
Input format :
Line 1 : Integer N (Array size)
Line 2 : Array elements (separated by space)
Line 3 : Integer x
Output format :
Line 1 : Pair 1 elements (separated by space)
Line 2 : Pair 2 elements (separated by space)
Line 3 : and so on
Constraints :
1 <= N <= 1000
1 <= x <= 100
Sample Input:
9
1 3 6 2 5 4 3 2 4
7
Sample Output :
1 6
3 4
3 4
2 5
2 5
3 4
3 4 */

import java.util.Arrays;

public class PairSum {

    public static void pairSum(int[] arr, int sum) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                if (arr[low] == arr[high]) {
                    int count = high - low + 1;
                    int n = count - 1;
                    int totalCount = ((n) * (n + 1)) / 2;
                    while (totalCount > 0) {
                        System.out.println(arr[low] + " " + arr[high]);
                        totalCount--;
                    }
                    low = high;
                } else {
                    int countLow = 0;
                    int countHigh = 0;
                    int i = low;
                    int temp = arr[low];

                    while (arr[i] == temp && i < high) {
                        i++;
                        countLow++;
                    }

                    int j = high;
                    temp = arr[high];

                    while (arr[j] == temp && j > low) {
                        j--;
                        countHigh++;
                    }
                    low = i;
                    high = j;
                    int total = countHigh * countLow;
                    while (total > 0) {
                        System.out.println(arr[low - 1] + " " + arr[high + 1]);
                        total--;
                    }
                }
            } else if (arr[low] + arr[high] > sum)
                high--;
            else
                low++;
        }
    }
}