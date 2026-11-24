// 9. Write a Java program to print all prime numbers between 1 and n using: (a)
// for loop (b) while loop (c) do-while loop

import java.util.Scanner;

public class P2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 2;

        for (i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }

        while (i <= n) {
            int j = 1;
            int count = 0;

            while (j <= i) {
                if (i % j == 0) {
                    count++;
                }
                j++;
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
            i++;
        }

        do {
            int j = 1;
            int count = 0;

            do {
                if (i % j == 0) {
                    count++;
                }
                j++;
            } while (j <= i);

            if (count == 2) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= n);
    }
}


