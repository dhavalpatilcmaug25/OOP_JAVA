/* 
3. Bank Transaction Check
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a
deposit (positive) or a withdrawal (negative).
Input:
Enter transaction amount: -2500
Output:
Withdrawal transaction


Code: 
*/


import java.util.*;
public class Q3_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction amount: ");
        int amount = sc.nextInt();
        

        String transaction = amount > 0 ? "Deposit transaction": "Withdrawal transaction";

        System.out.println(transaction);

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q3_Bank.java
Enter transaction amount: -2500
Withdrawal transaction

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q3_Bank.java
Enter transaction amount: 2133
Deposit transaction
*/