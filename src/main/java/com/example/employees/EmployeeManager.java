package com.example.employees;

public class EmployeeManager {
    private Employees[] employees = new Employees[4];;

    public EmployeeManager() {
        employees[0] = new Employees("E001", "John", "Doe", "john.doe@example.com", "Software Engineer");
        employees[1] = new Employees("E002", "Jane", "Smith", "jane.smith@example.com", "Product Manager");
        employees[2] = new Employees("E003", "Bob", "Johnson", "bob.johnson@example.com", "Data Analyst");
        employees[3] = new Employees("E004", "Alice", "Williams", "alice.williams@example.com", "UX Designer");
    }

    public Employees[] getEmployees() {
        return employees;
    }
}
