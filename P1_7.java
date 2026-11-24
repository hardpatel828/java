// 7.Write a Java program to calculate:
// 1. Area of a Triangle = (1/2) × base × height
// 2. Perimeter of a Rectangle = 2 × (length + breadth)


import java.util.Scanner;

public class P1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        double base = sc.nextDouble();

        System.out.print("Enter Height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();

        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}