// Write a program to print all the factors of a number other than 1 and the number itself.

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        scan.close();
    }
}