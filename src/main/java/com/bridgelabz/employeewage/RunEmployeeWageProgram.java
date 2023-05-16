package com.bridgelabz.employeewage;

public class RunEmployeeWageProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage employee1 = new EmployeeWage("Rohan","PartTime",20);
        employee1.checkEmployeeIsPresentOrAbsent();
        employee1.enterDailyWorkingHour();
        employee1.calculatingDailyWage();

    }
}
