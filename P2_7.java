// 7. Write a Java program to find the maximum and minimum of four numbers
// using nested if-else.

import java.util.Scanner;

public class P2_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        int max, min;

        if (a > b) {
            if (a > c) {
                if (a > d)
                    max = a;
                else
                    max = d;
            } else {
                if (c > d)
                    max = c;
                else
                    max = d;
            }
        } else {
            if (b > c) {
                if (b > d)
                    max = b;
                else
                    max = d;
            } else {
                if (c > d)
                    max = c;
                else
                    max = d;
            }
        }

        if (a < b) {
            if (a < c) {
                if (a < d)
                    min = a;
                else
                    min = d;
            } else {
                if (c < d)
                    min = c;
                else
                    min = d;
            }
        } else {
            if (b < c) {
                if (b < d)
                    min = b;
                else
                    min = d;
            } else {
                if (c < d)
                    min = c;
                else
                    min = d;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}