import java.util.Scanner;

public class AlphaPattern {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution. Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
        scan.close();
    }

}