/*
Problem 20: Bank Account Security
Scenario: A banking system needs to ensure that once a bank account ID is assigned, it cannot be
changed for security and audit purposes.
Task: Demonstrate the use of final variables in a banking context.
Sample Input:
Account ID: 101
Expected Output:
Account ID = 101 (cannot be changed)


*/

import java.util.*;
public class Q20_BankAccount {
    
    public static void main(String[] args) {
        Bank b1 = new Bank(101);
        System.out.println("Account ID = " + b1.getAccountId() + " (cannot be changed)");
        System.out.println();
    }
}

class Bank{
    private final int accountId;

    Bank(int accountId){
        this.accountId = accountId;
    }

    public int getAccountId(){
        return accountId;
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q20_BankAccount.java
Account ID = 101 (cannot be changed)

 */