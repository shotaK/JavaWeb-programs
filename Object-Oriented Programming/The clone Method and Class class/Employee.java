package com.javaweb;

public class Employee {
    private String lastName;
    private String firstName;
    Double salary;

    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Object clone() {
        Employee employee = new Employee(this.firstName, this.lastName);
        employee.setSalary(this.salary);
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
