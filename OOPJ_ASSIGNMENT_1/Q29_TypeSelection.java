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
public class Q29_TypeSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day Type: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Its workday");
                break;
            case 2:
                System.out.println("It's weekend. No work today");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q29_TypeSelection.java
Enter day Type: 2
It's weekend. No work today
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q29_TypeSelection.java
Enter day Type: 1
Its workday

*/