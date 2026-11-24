// 5. Write a Java program to check if the given number is a perfect number or not.
// (A number is perfect if sum of its divisors excluding itself is equal to the
// number.) Example: 28 → 1+2+4+7+14 = 28

import java.util.Scanner;

public class P2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}