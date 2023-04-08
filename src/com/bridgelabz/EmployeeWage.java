package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    public static void main(String[] args) {
        int isPresent = (int) (Math.random()*10)%3;
        int dailyWage = 0;
        switch (isPresent){
            case 0:{
                System.out.println("Employee is absent.");
                System.out.println("Daily wage is " + dailyWage);
            }break;
            case 1:{
                System.out.println("Employee is Full time present.");
                dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                System.out.println("Daily wage is " + dailyWage);
            }break;
            case 2:{
                System.out.println("Employee is Part time present.");
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Daily wage is " + dailyWage);
            }break;
        }
    }
}
