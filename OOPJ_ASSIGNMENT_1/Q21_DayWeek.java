/* 
21. Day of the Week (Ternary)
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
Input:
Enter day number: 3
Output:
Day is Wednesday


Code: 
*/


import java.util.*;
public class Q21_DayWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int day = sc.nextInt();
        
        String week = (day == 1) ? "Day is Monday" : 
        (day == 2) ? "Day is Tuesday" : 
        (day == 3) ? "Day is Wednesday" : 
        (day == 4) ? "Day is Thursday" : 
        (day == 5) ? "Day is Friday" : 
        (day == 6) ? "Day is Saturday" : 
        (day == 7) ? "Day is Sunday" : "Invalid";

        System.out.println(week);
        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q21_DayWeek.java 
Enter day number: 3
Day is Wednesday

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q21_DayWeek.java
Enter day number: 6
Day is Saturday
*/