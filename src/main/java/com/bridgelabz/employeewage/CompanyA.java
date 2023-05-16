package com.bridgelabz.employeewage;

public class CompanyA extends EmployeeWage{
    public CompanyA(String employeeName, String employeeType, int wagePerHour, int totalWorkingDay, int totalHour) {
        super(employeeName, employeeType, wagePerHour, totalWorkingDay, totalHour);
    }

    public static void main(String[] args) {
        CompanyA employee1 = new CompanyA("Raj","PartTime",30,22,105);
        employee1.calculatingMonthlyWages();
    }
}
