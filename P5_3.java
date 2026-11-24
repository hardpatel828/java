// Write a program to find interest of an amount given by a bank. This
// program code uses function overloading to find interest having two
// different forms. The first form accepts amount and percentage of interest
// and the second form accepts amount and percentage two values as
// parameters additionally with number of year as a parameter.

class Interest {
    double calculateInterest(double amount, double rate) {
        return (amount * rate) / 100;
    }

    double calculateInterest(double amount, double rate, int years) {
        return (amount * rate * years) / 100;
    }
}

public class P5_3 {
    public static void main(String[] args) {
        Interest i = new Interest();

        double interest1 = i.calculateInterest(10000, 5);
        double interest2 = i.calculateInterest(10000, 5, 3);

        System.out.println("Interest for first form: " + interest1);
        System.out.println("Interest for second form: " + interest2);
    }
}