package com.javaweb;

public class Main {
    public static void main(String[] args) {
        ParentClass a = new ChildClass(); // Works fine
        /*ChildClass b = new ParentClass();*/ // not allowed
        ChildClass c = (ChildClass) new ParentClass(); // Works fine
        String output = null;

        Employee emp = new Employee();
        Employee getEmp = emp.getEmployee(2);
        if (getEmp instanceof SalariedEmployee) {
            output = "Employee's salary is: ";
            output += ((SalariedEmployee) getEmp).getSalary();
        } else if (getEmp instanceof HourlyEmployee){
            output = "Employee's hourly rate is: ";
            output += ((HourlyEmployee) getEmp).getRate();
        }
        System.out.println(output);
    }
}
