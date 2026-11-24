// 8.Write a Java program to convert temperature from Celsius to Fahrenheit.
// Formula: F = (C × 1.8) + 32

import java.util.Scanner;

public class P1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("Temperature in Fahrenheit = " + f);
    }
}