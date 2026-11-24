// Create abstract class called Shape which has three sub classes say
// Triangle, Rectangle, and Circle. Define one method area() in abstract
// class and override this area() in these three subclasses to calculate area
// for specific object i.e. area() of Triangle subclass should calculate area of
// triangle. Same for rectangle, circle.

abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class P5_7 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(10, 6);
        Circle c = new Circle(7);

        System.out.println("Area of Triangle = " + t.area());
        System.out.println("Area of Rectangle = " + r.area());
        System.out.println("Area of Circle = " + c.area());
    }
}