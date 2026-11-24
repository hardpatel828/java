// 3. Write a Java program to merge two arrays and display the merged array in ascending order.

import java.util.Scanner;
import java.util.Arrays;

public class P3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = a[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = b[i];
        }

        Arrays.sort(merged);

        System.out.println("Merged Array in Ascending Order:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}