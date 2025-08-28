/* 
22. Month Name from Number
Scenario: Take month number (1–12) and print the month name using ternary operators or if-else.
Input:
Enter month number: 8
Output:
Month is August



Code: 
*/


import java.util.*;
public class Q22_MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int num = sc.nextInt();
        
        String Month = (num == 1) ? "Month is January" : 
        (num == 2) ? "Month is February" : 
        (num == 3) ? "Month is March" : 
        (num == 4) ? "Month is April" : 
        (num == 5) ? "Month is May" : 
        (num == 6) ? "Month is June" : 
        (num == 7) ? "Month is July" : 
        (num == 8) ? "Month is August" : 
        (num == 9) ? "Month is September" : 
        (num == 10) ? "Month is October" : 
        (num == 11) ? "Month is November" : 
        (num == 12) ? "Month is December" : "Invalid";
        

        System.out.println(Month);
        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q22_MonthName.java
Enter day number: 3
Month is March

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q22_MonthName.java
Enter day number: 8
Month is August
*/