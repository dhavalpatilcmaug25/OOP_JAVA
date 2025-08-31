/*
Problem 13: Bank Deposit & Withdrawal
Scenario:
Extend previous problem. Add methods:
● deposit(double amount) → adds to balance
● withdraw(double amount) → subtracts from balance
● Create two accounts, perform deposit/withdraw, display updated balance

 */

package OOPJ_ASSIGNMENT_2;

public class P13_DepositWithdraw {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rohit", 5000);
        BankAccount b2 = new BankAccount("Dhaval", 15000);
        
        b1.deposit(2000);
        b2.withdraw(5000);
        System.out.println("Updated Balance: ");
        b1.DisplayDetails();
        b2.DisplayDetails();

    }
}

class BankAccount{
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
        balance += amount;
        System.out.println("Deposited " + amount + " to " + accountHolder + "'s account.");
    } else {
        System.out.println("Deposit amount must be positive.");
    }
    }

    public void withdraw(double amount){
        if (amount <= 0) {
        System.out.println("Withdrawal amount must be positive.");
    } else if (amount > balance) {
        System.out.println("Insufficient balance for " + accountHolder + ".");
    } else {
        balance -= amount;
        System.out.println("Withdrew " + amount + " from " + accountHolder + "'s account.");
    }
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void DisplayDetails(){
        System.out.print("AccountHolder: "+accountHolder);
        System.out.println(" Balance: "+balance);
    }

}


/*
Deposited 2000.0 to Rohit's account.
Withdrew 5000.0 from Dhaval's account.
Updated Balance:
AccountHolder: Rohit Balance: 7000.0
AccountHolder: Dhaval Balance: 10000.0
 */