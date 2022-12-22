package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");
        int IS_FULL_TIME = 1;
        int empHrs = 8;
        int dailyWage = 0;
        int empWagePerHrs = 20;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            dailyWage = empHrs * empWagePerHrs;
        } else {
            System.out.println("Employee is Absent");

        }
        System.out.println("the daily wage of employee is "+dailyWage);
    }
}