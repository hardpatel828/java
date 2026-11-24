// Create a class Shape with overloaded methods calculateArea() to find area of
// circle, square, and rectangle using different arguments.


class Shape {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int width) {
        return length * width;
    }
}

class P4_5 {
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Area of Circle: " + s.calculateArea(5.0));
        System.out.println("Area of Square: " + s.calculateArea(4));
        System.out.println("Area of Rectangle: " + s.calculateArea(6, 4));
    }
}