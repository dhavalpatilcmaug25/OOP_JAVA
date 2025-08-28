/* 
4. Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number


Code: 
*/


import java.util.*;
public class Q4_Locker_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Locker number: ");
        int num = sc.nextInt();
        

        String Locker = num%2==0 ? "even locker number": "Odd locker number";

        System.out.println(Locker);

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q4_Locker_Number.java
Enter Locker number: 17
Odd locker number

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q4_Locker_Number.java
Enter Locker number: 8
even locker number
*/