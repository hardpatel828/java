// 4.Write a Java program to evaluate the following expressions:
// 1. Speed = Distance / Time
// 2. Simple Interest = (P × R × T) / 100
// 3. Volume of Cylinder = π × r2 × h

import java.util.Scanner;

public class P1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance: ");
        double distance = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double speed = distance / time;

        System.out.println("Speed = " + speed);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double si = (p * rate * t) / 100;

        System.out.println("Simple Interest = " + si);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        double volume = Math.PI * r * r * h;

        System.out.println("Volume of Cylinder = " + volume);
    }
}



