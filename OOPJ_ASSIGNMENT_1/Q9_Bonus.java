/* 
9. Employee Bonus Eligibility
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and
years of service as input and print bonus amount.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus amount: 2500



Code: 
*/


import java.util.*;
public class Q9_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter years of service: ");
        int year = sc.nextInt();
        
        if(year > 5){
            double discount = salary * 0.05;
            System.out.println("Bonus amount: " + discount);
        }
        else{
            System.out.println("No Bonus");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q9_Bonus.java
Enter salary: 50000 
Enter years of service: 7
Bonus amount: 2500.0

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q9_Bonus.java
Enter salary: 40000 
Enter years of service: 2
No Bonus
*/