// 6. Write a Java program to generate and print n terms of the Harmonic series.
// Harmonic series: 1 + 1/2 + 1/3 + 1/4 + ...

import java.util.Scanner;

public class P2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Harmonic Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);

            if (i < n) {
                System.out.print(" + ");
            }
        }
    }
}