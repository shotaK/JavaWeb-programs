package com.javaweb;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Roy","Khan");
        Employee employee2 = new Employee("Roy","Khan");
        if (employee1 == employee2) {
            System.out.println("Objects are same");
        } else {
            System.out.println("Objects are not same");
        }

        if (employee1.equals(employee2)) {
            System.out.println("Objects are same");
        } else {
            System.out.println("Objects are not same");
        }
    }
}
