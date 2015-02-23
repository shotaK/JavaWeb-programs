package com.javaweb;

public class Employee {

    public Employee getEmployee(int type) {
        if (type == 1) {
            SalariedEmployee salariedEmployee = new SalariedEmployee();
            return salariedEmployee;
        } else {
            HourlyEmployee hourlyEmployee = new HourlyEmployee();
            return hourlyEmployee;
        }
    }
}
