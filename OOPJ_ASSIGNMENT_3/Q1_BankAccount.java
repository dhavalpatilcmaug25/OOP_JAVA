/*
1. Bank Account Protection
Scenario: You are creating a simple banking system. A user should not be able to directly change their
balance.
Problem Statement:
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance.
Class/Fields:
● private double balance
Methods:
● deposit(double amount) → add to balance
● withdraw(double amount) → subtract from balance if sufficient
● getBalance() → returns current balance
Sample Input:
Deposit = 5000
Withdraw = 2000
Sample Output:
Updated Balance = 3000
*/


import java.util.*;

class Q1Bank_Account{
	public static void main(String []args){
		BankAccount b1 = new BankAccount();
		
		b1.deposit(5000);
		b1.withdraw(2000);
		System.out.println("Updated Balance = " + b1.getBalance());
	}
}

class BankAccount{
	private double balance;
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount){
		balance -= amount;
	}
	
	public double getBalance(){
		return balance;
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q1Bank_Account
Updated Balance = 3000.0

*/

