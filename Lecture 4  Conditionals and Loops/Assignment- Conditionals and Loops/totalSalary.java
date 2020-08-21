/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf */

import java.util.Scanner;

public class totalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bs = sc.nextLong();
        char grade = sc.next().charAt(0);
        double hra = 0.0;
        double da = 0.0;
        double allow = 0.0;
        double pf = 0.0;
        long total = 0l;
        if (bs >= 0 && bs <= 7500000) {
            hra = 0.20 * bs;
            da = 0.50 * bs;
            switch (grade) {
                case 'A':
                case 'a':
                    allow = 1700.0;
                    break;
                case 'B':
                case 'b':
                    allow = 1500.0;
                    break;
            }
            pf = 0.11 * bs;
        }
        total = (long) Math.round(bs + hra + da + allow - pf);
        System.out.println(total);
        sc.close();
    }
}