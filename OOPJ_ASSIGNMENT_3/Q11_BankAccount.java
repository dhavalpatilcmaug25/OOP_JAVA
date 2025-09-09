/*

11. Bank Account Types
Scenario: Bank provides different account types.
Problem Statement:
Superclass Account → accountNo, balance. Subclass SavingAccount → interestRate. Subclass
CurrentAccount → overdraftLimit. Display account details.
Classes/Fields:
● Account → accountNo, balance
● SavingAccount → interestRate
● CurrentAccount → overdraftLimit
Sample Input:
Saving → accountNo=101, balance=5000, interestRate=5%
Current → accountNo=102, balance=10000, overdraftLimit=2000
Sample Output:
Saving → 101, Balance=5000, Interest=5%
Current → 102, Balance=10000, Overdraft=2000



code:
*/

class Q11_BankAccount{
	public static void main(String args[]){
		SavingAccount s1 = new SavingAccount(101, 5000, 5);
		CurrentAccount c1 = new CurrentAccount(102, 10000, 2000);
		
		s1.displayDetail();
		c1.displayDetail();
	}
}

class Account{
	int accountNo;
	double balance;
	
	Account(int accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
}

class SavingAccount extends Account{
	int interestRate;
	
	SavingAccount(int accountNo, double balance, int interestRate){
		super(accountNo, balance);
		this.interestRate = interestRate;
	}
	
	void displayDetail(){
		System.out.println("Saving ---> " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
	}
	
}

class CurrentAccount extends Account{
	int overdraftLimit;
	
	CurrentAccount(int accountNo, double balance, int overdraftLimit){
		super(accountNo, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	void displayDetail(){
		System.out.println("Current ---> " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q11_BankAccount
Saving ---> 101, Balance=5000.0, Interest=5%
Current ---> 102, Balance=10000.0, Overdraft=2000
*/