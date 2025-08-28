/* 
39. Bonus Eligibility (Ternary)
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print
bonus eligibility using ternary.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus: 2500


Code: 
*/


import java.util.*;
public class Q39_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter years of service: ");
        int year = sc.nextInt();

        double bonus = (year > 5) ? salary*0.05 : salary;

        System.out.println(bonus);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q39_Bonus.java
Enter salary: 50000
Enter years of service: 6
2500.0

*/