import java.util.Scanner;

class ReverseNumberPattern {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution. Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}