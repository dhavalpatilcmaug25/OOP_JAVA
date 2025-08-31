/*
Problem 14: Bank Name Display
Scenario:
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to
BankAccount.
● Call displayBankName() from main.
● Create one account to verify instance creation.

 */

package OOPJ_ASSIGNMENT_2;

public class P14_BankName {
    public static void main(String[] args) {
        BankAccount.displayBankName();

        BankAccount b1 = new BankAccount("Rohit");

    }
}

class BankAccount{
    static String bankName = "CDAC Bank";
    String name;

    public static void displayBankName(){
        System.out.println("Bank Name: "+bankName);
    }

    BankAccount(String name){
        this.name = name;
        System.out.println("Bank Account created for " + name);
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P14_BankName.java
Bank Name: CDAC Bank
Bank Account created for Rohit
 */