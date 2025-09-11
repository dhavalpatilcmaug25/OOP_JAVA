/*
Problem 25: Payment Processing
Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to
convert them to integers for financial calculations.
Task: Parse string input to integer and perform calculations.
Sample Input:
Amount as string: 1000
Additional amount to add: 500
Expected Output:
1000 + 500 = 1500


*/

import java.util.*;
public class Q25_PaymentProcess {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount as string: ");
        String s = sc.nextLine();

        System.out.print("Additional amount to add: ");
        int b = sc.nextInt();

        int a = Integer.parseInt(s);

        System.out.println(a+ " + " + b + " = " + (a+b));
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java q25_PaymentProcess.java
Amount as string: 1000
Additional amount to add: 500
1000 + 500 = 1500
 */