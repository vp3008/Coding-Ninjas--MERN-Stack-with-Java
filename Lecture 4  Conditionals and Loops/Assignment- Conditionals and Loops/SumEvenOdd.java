// Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.Digits mean numbers,not the places!That is,if the given integer is"13245",even digits are 2&4 and odd digits are 1,3&5.

import java.util.Scanner;

public class SumEvenOdd {

    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        while (n != 0) {
            int i = n % 10;
            n = n / 10;
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }

        System.out.println(evenSum + " " + oddSum);
        scan.close();
    }
}
