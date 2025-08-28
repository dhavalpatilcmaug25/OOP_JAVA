/* 
6. Leap Year Check for a Birthday
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input
and check if it’s a leap year.
Input:
Enter year: 2024
Output:
2024 is a leap year


Code: 
*/


import java.util.*;
public class Q6_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q6_LeapYear.java
Enter year: 2024
2024 is a leap year

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q6_LeapYear.java
Enter year: 2025
2025 is not a leap year
*/