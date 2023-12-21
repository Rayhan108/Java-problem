class Member {
    // Data members
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Parameterized constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}

class Employee extends Member {
    // Additional data members for Employee class
    String specialization;

    // Parameterized constructor for Employee
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    // Additional data members for Manager class
    String department;

    // Parameterized constructor for Manager
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class EmployeManager{
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 30, "123-456-7890", "123 Main St", 50000, "Java Developer");

        // Printing details and salary of the Employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();

        System.out.println("\n--------------------------\n");

        // Creating a Manager object
        Manager manager = new Manager("Alice Smith", 40, "987-654-3210", "456 Park Ave", 70000, "IT Manager");

        // Printing details and salary of the Manager
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}
