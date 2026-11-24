// Create a class named Date having three instance variables named Day,
// Month and Year also has two set_date() to catch values of instance
// variables and get_date() to display caught values on the output screen.
// And create another class DateDemo containing main() method.

class Date {
    int day;
    int month;
    int year;

    void set_date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    void set_date(int d) {
        day = d;
    }

    void get_date() {
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}

public class P5_1 {
    public static void main(String[] args) {
        Date date = new Date();

        date.set_date(5, 10, 2026);
        date.get_date();
    }
}