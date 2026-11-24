// Create a Java class named Student that stores student name, ID, and course.
// Include methods to set details, display details, and create another class
// StudentDemo with the main() method to test it.

class Student {
    String name;
    int id;
    String course;

    void setDetails(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }
}

class P4_1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setDetails("Rahul", 101, "Java");

        s.displayDetails();
    }
}

