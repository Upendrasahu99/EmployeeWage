package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

    String name;

    public EmployeeWage(String name) {
        this.name = name;
    }

    public boolean checkEmployeeIsPresentOrAbsent() {
        Random random = new Random();
        boolean a = random.nextBoolean();
        if (a == true) {
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage employee1 = new EmployeeWage("Rohan");
        employee1.checkEmployeeIsPresentOrAbsent();
    }
}
