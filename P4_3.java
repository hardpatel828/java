//  Create a class Employee with empId, empName, and salary. Include a method
// to display details and another to calculate bonus (10% of salary). Test it using
// EmployeeDemo with the main() method.


class Employee {
    int empId;
    String empName;
    double salary;

    void setDetails(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class P4_3 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setDetails(101, "Rahul", 50000);

        e.displayDetails();

        double bonus = e.calculateBonus();
        System.out.println("Bonus: " + bonus);
    }
}