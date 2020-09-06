/* Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321 */

import java.util.Scanner;

public class NumberStarPattern1 {

    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        int c = n;
        while (i <= n) {
            int j = n;
            while (j >= 1) {
                if (j == i) {
                    System.out.print("*");
                    j--;
                } else {
                    System.out.print(j--);
                }
            }
            System.out.println();
            i++;
        }
    }
}
