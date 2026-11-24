// 8. Write a Java program to show widening and narrowing typecasting between
// int, float, and double.

public class P2_8 {
    public static void main(String[] args) {
        int i = 25;
        float f;
        double d;

        f = i;
        d = f;

        System.out.println("Widening Type Casting:");
        System.out.println("Int = " + i);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);

        d = 45.78;
        f = (float) d;
        i = (int) f;

        System.out.println("\nNarrowing Type Casting:");
        System.out.println("Double = " + d);
        System.out.println("Float = " + f);
        System.out.println("Int = " + i);
    }
}