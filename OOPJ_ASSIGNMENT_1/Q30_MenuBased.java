/* 
29. Day Type Selection
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
Input:
Enter day type (1–Workday, 2–Weekend): 2
Output:
It’s weekend. No work today.


Code: 
*/


import java.util.*;
public class Q30_MenuBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Selection operation (1-Addition, 2-Subtraction): ");
        int op = sc.nextInt();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Result: " + (num1+num2));
                break;
            case 2:
                System.out.println("Result: " + (num1-num2));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q30_MenuBased.java
Selection operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Result: 50

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q30_MenuBased.java
Selection operation (1-Addition, 2-Subtraction): 2
Enter first number: 20
Enter second number: 30
Result: -10
*/