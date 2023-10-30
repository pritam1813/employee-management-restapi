package com.example.employees;

public class Employees {
    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employees(String employee_id, String first_name, String last_name, String email, String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    public String getEmployeeId() {
        return this.employee_id;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTitle() {
        return this.title;
    }

    // TO DO setters
}
