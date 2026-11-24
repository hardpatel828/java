// Write a program to create interface shape containing area() method.
// Now create Rectangle, Triangle, Sphere class that implements shape
// interface and override area() to calculate area of rectangle ,triangle and
// sphere.

interface Shape {
    double area();
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Triangle implements Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class Sphere implements Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

public class P5_9 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 6);
        Sphere s = new Sphere(7);

        System.out.println("Area of Rectangle = " + r.area());
        System.out.println("Area of Triangle = " + t.area());
        System.out.println("Area of Sphere = " + s.area());
    }
}