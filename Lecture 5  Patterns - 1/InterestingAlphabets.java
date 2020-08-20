import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        // Your code goes here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char ch = 'A';

        for (int i = 0; i < n - 1; i++)
            ch++;

        for (int i = 1; i <= n; i++) {
            char c = ch;
            for (int j = 0; j < i; j++) {
                System.out.print(c++);
            }
            System.out.println();
            ch--;
        }
    }
}