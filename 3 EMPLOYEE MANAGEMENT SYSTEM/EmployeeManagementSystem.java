import java.util.ArrayList;
import java.util.List;

/**
 * Employee Management System demonstrating basic OOP concepts in Java
 * Contains Employee class and main program logic in single file
 */
class Employee {
    // Employee attributes
    private int id;
    private String name;
    private double salary;

    /**
     * Constructor to initialize employee details
     * @param id Employee ID
     * @param name Employee Name
     * @param salary Employee Salary
     */
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Displays formatted employee details to console
     */
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Salary: $%.2f%n", salary);
        System.out.println("----------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee(101, "John Smith", 75000.0);
        Employee emp2 = new Employee(102, "Sarah Johnson", 82000.5);
        Employee emp3 = new Employee(103, "Michael Chen", 68500.75);

        // Create list and add employees
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Display details for all employees
        System.out.println("Employee Management System");
        System.out.println("=========================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}