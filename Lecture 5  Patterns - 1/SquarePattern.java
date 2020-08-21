/* Pattern for N = 4
4444
4444
4444
4444 */

import java.util.*;

public class SquarePattern {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution. Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
        scan.close();

    }

}