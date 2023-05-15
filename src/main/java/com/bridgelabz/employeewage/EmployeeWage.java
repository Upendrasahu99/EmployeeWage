package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

    String name;
    int employeePresent;
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
        this.employeePresent = random.nextInt(2);
        switch (employeePresent) {
            case 1:
                System.out.println("Employee is Present");
                break;
            case 0:
                System.out.println("Employee is Absent");
                break;
            default:

        }
    }


    public void calculatingDailyWage() {
        if (employeePresent == 1) {
            this.totalDailyWage = dailyWorkingHour * wagePerHour;
            System.out.println(employeeType + " employee " + name + " total daily wage is " + totalDailyWage);
        }
    }

}
