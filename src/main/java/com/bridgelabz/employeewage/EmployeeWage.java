package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

    String name;
    boolean employeePresent;
    String employeeType;
    int wagePerHour;
    int totalDailyWage;

    int dailyWorkingHour;

    public EmployeeWage(String name, String employeeType, int wagePerHour) {
        this.name = name;
        this.employeeType = employeeType;
        this.wagePerHour = wagePerHour;
    }

    public void enterDailyWorkingHour() {
        if (employeeType == "FullTime") {
           dailyWorkingHour = 8;
        } else if (employeeType == "PartTime") {
           dailyWorkingHour = 4;
        }
    }

    public void checkEmployeeIsPresentOrAbsent() {
        Random random = new Random();
        this.employeePresent = random.nextBoolean();
        if (employeePresent == true) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }


    public void calculatingDailyWage() {
        if (employeePresent == true) {
            this.totalDailyWage = dailyWorkingHour * wagePerHour;
            System.out.println(employeeType + " employee " + name + " total daily wage is " + totalDailyWage);
        }
    }

}
