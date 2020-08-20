// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
// Note : For this question, you can assume that 0 raised to the power of 0 is 1

import java.util.Scanner;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        System.out.println(result);
    }
}