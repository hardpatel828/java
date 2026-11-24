// 2. Write a Java program to take two floating-point numbers from the command
// line and print their sum, difference, product, quotient, and modulus.

public class P2_2 {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + (num1 / num2));
        System.out.println("Modulus = " + (num1 % num2));
    }
}