/* Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 */

public class MergeSort {

    public static void mergeSort(int[] input) {
        // Write your code here
        sorting(input, 0, input.length - 1);
    }

    public static void sorting(int input[], int first, int last) {
        if (first < last) {
            int mid = first + (last - first) / 2;
            sorting(input, first, mid);
            sorting(input, mid + 1, last);
            merge(input, first, last, mid);
        }
    }

    public static void merge(int input[], int first, int last, int mid) {
        int n1 = mid - first + 1;
        int n2 = last - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = input[first + i];

        for (int j = 0; j < n2; j++)
            R[j] = input[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = first;
        while (i < n1 && j < n2) {
            if (L[i] < R[j])
                input[k++] = L[i++];
            else
                input[k++] = R[j++];
        }

        while (i < n1)
            input[k++] = L[i++];
        while (j < n2)
            input[k++] = R[j++];
    }
}
