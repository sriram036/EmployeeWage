package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isPresent = (int) (Math.random()*10)%2;
        if(isPresent == 1){
            System.out.println("Employee is Present.");
        }
        else {
            System.out.println("Employee is Absent.");
        }
    }
}
