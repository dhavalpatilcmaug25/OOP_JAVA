/*

19. Bank Account Types
Scenario: Bank manages different types of accounts: Savings and Current. Both share basic account
details, but Savings accounts have interest and Current accounts have overdraft limit.
Problem Statement:
Create a superclass BankAccount with:
● Fields: accountNumber, accountHolder, balance
● Method: displayBalance()
Create subclasses:
● SavingsAccount → field: interestRate, method: calculateInterest()
● CurrentAccount → field: overdraftLimit, method: checkOverdraft()
Sample Input:
SavingsAccount → accountNumber=101, accountHolder=Ramesh, balance=5000, interestRate=5%
CurrentAccount → accountNumber=102, accountHolder=Anita, balance=2000, overdraftLimit=1000
Sample Output:
Ramesh → Balance=5000, Interest=250
Anita → Balance=2000, Overdraft Limit=1000


code:
*/


class Q19_BankAccount{
	public static void main(String args[]){
		BankAccount s1 = new SavingAccount(101,"Ramesh", 5000, 5);
		BankAccount c1 = new CurrentAccount(102,"Anita" ,2000, 1000);
		
		s1.displayDetail();
		c1.displayDetail();
	}
}

class BankAccount{
	int accountNo;
	String accountHolder;
	double balance;
	
	BankAccount(int accountNo, String accountHolder, double balance){
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	void displayDetail(){
		System.out.println("Balance= " + balance);
	}
}

class SavingAccount extends BankAccount{
	int interestRate;
	
	SavingAccount(int accountNo, String accountHolder, double balance, int interestRate){
		super(accountNo, accountHolder, balance);
		this.interestRate = interestRate;
	}
	
	void displayDetail(){
		double rate = (interestRate * balance)/100;
		System.out.println(accountHolder +" ---> Balance=" + balance + ", Interest=" + rate);
	}
	
}

class CurrentAccount extends BankAccount{
	int overdraftLimit;
	
	CurrentAccount(int accountNo, String accountHolder, double balance, int overdraftLimit){
		super(accountNo, accountHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	void displayDetail(){
		System.out.println(accountHolder +" ---> Balance=" + balance + ", Overdraft=" + overdraftLimit);
	}
}

/*
C:\Users\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q19_BankAccount
Ramesh ---> Balance=5000.0, Interest=250.0
Anita ---> Balance=2000.0, Overdraft=1000

*/