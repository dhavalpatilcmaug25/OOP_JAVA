/*
Problem 6: Age Restriction
Scenario: A professional workshop registration system only allows participants who are 18 years or
older. The system needs a custom exception for age validation.
Task: Create a custom exception class and use it to validate user age during registration.
Sample Input:
16
Expected Output:
AgeNotValidException: Age must be ≥ 18

 */

import java.util.*;
public class Q6_AgeRestriction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        

        try {
            if(age<18){
                throw new AgeNotValidException();
            }
            System.out.println("Registration Successfull");
            
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

class AgeNotValidException extends Exception{
    public AgeNotValidException(){
        super("AgeNotValidException: Age must be ≥ 18");
    }
}

/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q6_AgeRestriction.java
16
AgeNotValidException: Age must be ≥ 18

 */