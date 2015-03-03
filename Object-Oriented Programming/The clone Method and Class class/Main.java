package com.javaweb;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Roy","Khan");
        employee1.setSalary(2000.00);
        Employee employee2 = new Employee("Toby","Sammet");
        employee2.setSalary(5000.00);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        Employee emp = new Employee("Roy","Khan");
        Class cl = emp.getClass();
        System.out.println(cl);

        Employee emp2 = new HourlyEmployee("Roy","Khan");
        Class cl2 = emp2.getClass();
        System.out.println(cl2);
    }
}
