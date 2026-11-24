//  Write a Java program to using function overloading method to read set
// of integers and floating point numbers separately and to store it in the
// corresponding arrays. Again read a number from the keyboard and
// check whether the number ‘d’ is present in the arrays. If it is so, print
// out how many times the number ‘d’ is repeated in the array.


import java.util.Scanner;

class NumberArray {
    int[] read(int n, Scanner sc) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        return a;
    }

    float[] read(int n, Scanner sc, boolean isFloat) {
        float[] a = new float[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextFloat();
        }

        return a;
    }

    int count(int[] a, int d) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                count++;
            }
        }

        return count;
    }

    int count(float[] a, float d) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                count++;
            }
        }

        return count;
    }
}

public class P5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberArray obj = new NumberArray();

        System.out.print("Enter number of integers: ");
        int n1 = sc.nextInt();

        System.out.println("Enter integers:");
        int[] intArray = obj.read(n1, sc);

        System.out.print("Enter number of floating point numbers: ");
        int n2 = sc.nextInt();

        System.out.println("Enter floating point numbers:");
        float[] floatArray = obj.read(n2, sc, true);

        System.out.print("Enter integer to search: ");
        int d1 = sc.nextInt();

        int intCount = obj.count(intArray, d1);

        System.out.print("Enter floating point number to search: ");
        float d2 = sc.nextFloat();

        int floatCount = obj.count(floatArray, d2);

        System.out.println(d1 + " is repeated " + intCount + " times in integer array.");
        System.out.println(d2 + " is repeated " + floatCount + " times in floating point array.");

        sc.close();
    }
}