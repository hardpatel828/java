// 5.Write a Java program to accept 4 command-line arguments: Roll Number,
// Name, Course, Semester
// Print them:
// (a) On a single line
// (b) Each on a separate line
// Sample Output:
// Roll Number: 23CS102
// Name: Anjali
// Course: BTech CSE
// Semester: 3

public class P1_5 {
    public static void main(String[] args) {
        System.out.println("Single Line Output:");
        System.out.println("Roll Number: " + args[0] + " Name: " + args[1] + " Course: " + args[2] + " Semester: " + args[3]);

        System.out.println("\nSeparate Line Output:");
        System.out.println("Roll Number: " + args[0]);
        System.out.println("Name: " + args[1]);
        System.out.println("Course: " + args[2]);
        System.out.println("Semester: " + args[3]);
    }
}