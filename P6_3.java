// Write a program to catch multiple exceptions such as
// ArrayIndexOutOfBounds Exception, NumberFormatException,
// NullPointerException and also use finally block.

class P6_3 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);

            int num = Integer.parseInt("abc");
            System.out.println(num);

            String str = null;
            System.out.println(str.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (NullPointerException e) {
            System.out.println("Null value cannot be used");
        } finally {
            System.out.println("Finally block is executed");
        }
    }
}