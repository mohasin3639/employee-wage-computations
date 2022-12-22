package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");
        int empHrsFullTime = 8;
        int empHrsPartTime = 4;
        int dailyWage ;
        int empWagePerHrs = 20;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case 1:
            System.out.println("Employee is Present");
            dailyWage = empHrsFullTime * empWagePerHrs;
            System.out.println("the daily wage of employee is " + dailyWage);
            break;
            case 2:
                System.out.println("Employee is Part-Time Present");
                dailyWage = empHrsPartTime * empWagePerHrs;
                System.out.println("the daily wage of employee is " + dailyWage);
             break;
            default:
                System.out.println("Employee is Absent");
            }
        }
    }
