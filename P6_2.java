// Write a program to apply the nested try blocks and multiple catch blocks.

class P6_2 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                int a = 10;
                int b = 0;
                int result = a / b;
                System.out.println(result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        } 
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
    }
}