// 11. Write a Java program to declare an int variable x = 5 and test these
// increment and decrement statements:
// System.out.println(++x);
// System.out.println(x--);
// System.out.println(x);
// System.out.println(--x);
// System.out.println(x++);
// System.out.println(x);
// Add comments on output.

public class P2_11 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(++x); // 6
        System.out.println(x--); // 6
        System.out.println(x);   // 5
        System.out.println(--x); // 4
        System.out.println(x++); // 4
        System.out.println(x);   // 5
    }
}