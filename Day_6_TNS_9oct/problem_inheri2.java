// Practice question: Employee and Manager
// Problem statement
// Create a Java program with a parent class Employee and a child class Manager.
// 1. Parent class: Employee
// - Variables: String name and double salary.
// - Create a constructor that initializes both variables.
// - Create a method displayDetails() that prints the employee's name and salary.
// 2. Child class: Manager
// - Inherit from Employee.
// - Add a variable String department.
// - Create a constructor that accepts name, salary, and department.
// - Use super() to initialize the parent's variables.
// - Override displayDetails() to display the employee details, department, and the message "Role: Manager".
// - Use super.displayDetails() instead of printing the name and salary again.
// 3. Main class
// Create a Manager object with these values:
// - Name: "Himanshu"
// - Salary: 75000
// - Department: "IT"
// Call displayDetails()
// build in parent and child class in java?15,23,30
class employee2 {
    String name;
    double salary;

    employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class manager2 extends employee2 {
    String department;

    manager2(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Role: Manager");
    }
}

public class problem_inheri2 {
    public static void main(String[] args) {
        manager2 m = new manager2("Himanshu", 75000, "IT");
        m.displayDetails();
    }
}