// Create a class Room which has two instance variables length and breadth
// and a method called area() to find area of Room. Create another class
// BedRoom which inherit Room class and has an instance variable height
// and a method volume() to find volume in BedRoom. Use necessary
// constructors in both class. A main() method resides in another class.


class Room {
    double length;
    double breadth;

    Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class BedRoom extends Room {
    double height;

    BedRoom(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class P5_6 {
    public static void main(String[] args) {
        BedRoom b = new BedRoom(10, 8, 5);

        System.out.println("Area of Room = " + b.area());
        System.out.println("Volume of BedRoom = " + b.volume());
    }
}