package com.akhil.employeemanagementapi.dto;

public class EmployeeResponse {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private int salary;
    private String joiningDate;

    public EmployeeResponse() {
    }

    public EmployeeResponse(Integer id, String firstName, String lastName, String email, String department, int salary, String joiningDate) {
        this.id= id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }
    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getDepartment() {

        return department;

    }

    public void setDepartment(String department) {

        this.department = department;

    }

    public int getSalary() {

        return salary;

    }

    public void setSalary(int salary) {

        this.salary = salary;

    }

    public String getJoiningDate() {

        return joiningDate;

    }

    public void setJoiningDate(String joiningDate) {

        this.joiningDate = joiningDate;

    }
}
