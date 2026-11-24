// Create a Java class named Box that calculates the volume of a box. The
// class should have instance variables named length, width, and height,
// which are initialized with values obtained from user input. Implement a
// method within the class named calculateVolume() that computes and
// returns the volume of the box.


import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    double calculateVolume() {
        return length * width * height;
    }
}

public class P5_5 {
    public static void main(String[] args) {
        Box b = new Box();

        b.getData();

        System.out.println("Volume of Box = " + b.calculateVolume());
    }
}