// 9.Write a Java program that accepts your name and age as command-line arguments
// and prints:
// Hello, [Name]! You are [Age] years old.

public class P1_9 {
    public static void main(String[] args) {
        System.out.println("Hello, " + args[0] + "! You are " + args[1] + " years old.");
    }
}