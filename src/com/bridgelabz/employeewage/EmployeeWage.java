package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");
        int empHrs;
        int empWagePerHrs = 20;
        int workingDaysPerMonth = 20;
        int maximumHrsInMonth = 100;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHrs <= maximumHrsInMonth &&
                totalWorkingDays < workingDaysPerMonth) {
            totalWorkingDays++; {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case 1:
                        System.out.println("Employee is Present");
                        empHrs = 8;
                        break;
                    case 2:
                        System.out.println("Employee is Part-Time Present");
                        empHrs = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        empHrs = 0;
                }
                totalEmployeeHrs = empHrs + totalEmployeeHrs;
                System.out.println("Day:" + totalWorkingDays + " EmpHour: " + empHrs);
            }
            int totalEmployeeWage = totalEmployeeHrs * empWagePerHrs;
            System.out.println("Total Employee Wage " + totalEmployeeWage);
        }
    }
}
