// Write a Java program using method overloading to find maximum of two
// integers, three integers, and two double values.


class Maximum {
    int max(int a, int b) {
        return Math.max(a, b);
    }

    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    double max(double a, double b) {
        return Math.max(a, b);
    }
}

class P4_6 {
    public static void main(String[] args) {
        Maximum m = new Maximum();

        System.out.println("Maximum of two integers: " + m.max(10, 20));
        System.out.println("Maximum of three integers: " + m.max(10, 25, 15));
        System.out.println("Maximum of two double values: " + m.max(12.5, 15.8));
    }
}