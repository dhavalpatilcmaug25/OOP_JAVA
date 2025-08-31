/*
Problem 12: Bank Account Basic Info
Scenario:
Create BankAccount class with accountHolder and balance.
● Use parameterized constructor to initialize account.
● Create getter and setter for balance.
● In main, create one account and display details
 
 */

package OOPJ_ASSIGNMENT_2;

public class P12_BankInfo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rohit", 5000);
    
        b1.DisplayDetails();
    }
}

class BankAccount{
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
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
        System.out.println("AccountHolder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P12_BankInfo.java
AccountHolder: Rohit
Balance: 5000.0
 */