/* 
19. Days in a Month
Scenario: Take month number (1–12) and print number of days in that month.
Input:
Enter month number: 2
Output:
28 or 29 days




Code: 
*/


import java.util.*;
public class Q19_DaysMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();
        
        if (month == 2) {
            System.out.println("28 or 29 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("31 days");
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q19_DaysMonth.java 
Enter day number: 4
Day is Thursday
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q19_DaysMonth.java
Enter month number: 2
28 or 29 days
Enter month number: 1
31 days
*/