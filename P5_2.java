// Create a class Exam having stu_name, rollno, sub_code, sub_name,
// InternalMarks and ExternalMarks also contains two methods
// Calculate_result() and Show_result(). Students having marks to be
// shown in ouput with his name and roll_no. A main() method is contained
// by Exam_demo class. Use parameterized constructor with local variable
// named as instance variables which hides them. Note: Use your additional
// variables as per your needs.


class Exam {
    String stu_name;
    int rollno;
    String sub_code;
    String sub_name;
    int InternalMarks;
    int ExternalMarks;
    int total;
    String result;

    Exam(String stu_name, int rollno, String sub_code, String sub_name, int InternalMarks, int ExternalMarks) {
        this.stu_name = stu_name;
        this.rollno = rollno;
        this.sub_code = sub_code;
        this.sub_name = sub_name;
        this.InternalMarks = InternalMarks;
        this.ExternalMarks = ExternalMarks;
    }

    void Calculate_result() {
        total = InternalMarks + ExternalMarks;

        if (total >= 40 && InternalMarks >= 16 && ExternalMarks >= 24) {
            result = "Pass";
        } else {
            result = "Fail";
        }
    }

    void Show_result() {
        System.out.println("Student Name: " + stu_name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Subject Code: " + sub_code);
        System.out.println("Subject Name: " + sub_name);
        System.out.println("Internal Marks: " + InternalMarks);
        System.out.println("External Marks: " + ExternalMarks);
        System.out.println("Total Marks: " + total);
        System.out.println("Result: " + result);
    }
}

public class P5_2 {
    public static void main(String[] args) {
        Exam e = new Exam("Rahul", 101, "CS101", "Java", 25, 55);

        e.Calculate_result();
        e.Show_result();
    }
}