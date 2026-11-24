// Write a program that shows the use of throws keyword.

class P6_5 {

    static void checkNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Number cannot be negative");
        }
        System.out.println("Number is valid");
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}