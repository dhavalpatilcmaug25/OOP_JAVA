/* 
5. Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden



Code: 
*/


import java.util.*;
public class Q5_Garden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        

        String Garden = length==width ? "Sqaure Garden": "Rectangular Garden";

        System.out.println(Garden);

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q5_Garden.java
Enter length: 5 
Enter width: 5
Sqaure Garden
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q5_Garden.java
Enter length: 5
Enter width: 7
Rectangular Garden
*/