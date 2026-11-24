// 4. Write a Java program to find the sum of digits of a number using a command
// line argument. Example: 123 → 1+2+3 = 6

public class P2_4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}