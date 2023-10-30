package com.example.employees;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {

    private static Employees list = new Employees();

    // Manually initialize service to contain some employees
    static {
        Employee employee1 = new Employee("E001", "John", "Doe", "john.doe@example.com", "Software Engineer");
        Employee employee2 = new Employee("E002", "Jane", "Smith", "jane.smith@example.com", "Product Manager");
        Employee employee3 = new Employee("E003", "Bob", "Johnson", "bob.johnson@example.com", "Data Analyst");
        Employee employee4 = new Employee("E004", "Alice", "Williams", "alice.williams@example.com", "UX Designer");

        list.getEmployeeList().add(employee1);
        list.getEmployeeList().add(employee2);
        list.getEmployeeList().add(employee3);
        list.getEmployeeList().add(employee4);
    }

    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
