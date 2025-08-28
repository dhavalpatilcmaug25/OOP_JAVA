/* 
37. Leap Year Check (Ternary)
Scenario: Take a year as input and check if it is a leap year using ternary operator.
Input:
Enter year: 2024
Output:
Leap Year

Code: 
*/


import java.util.*;
public class Q37_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String str = (year%4 == 0 && year%100 != 0 || year%400 == 0) ? "Leap Year" : "Not Leap Year";

        System.out.println(str);

        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q37_LeapYear.java
Enter year: 2024
Leap Year
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q37_LeapYear.java
Enter year: 2025
Not Leap Year

*/