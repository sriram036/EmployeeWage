package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    public static void main(String[] args) {
        int isPresent = (int) (Math.random()*10)%2;
        int dailyWage = 0;
        if(isPresent == 1){
            System.out.println("Employee is Present.");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        }
        else {
            System.out.println("Employee is Absent.");
        }
        System.out.println("Daily Wage is " + dailyWage);
    }
}
