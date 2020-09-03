/* Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false */

public class CheckNumberInArray {

    public static boolean checkNumber(int input[], int x) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        return find(input, input.length, x);
    }

    public static boolean find(int input[], int n, int x) {
        if (n <= 0)
            return false;
        if (input[n - 1] == x)
            return true;
        else
            return find(input, n - 1, x);
    }
}