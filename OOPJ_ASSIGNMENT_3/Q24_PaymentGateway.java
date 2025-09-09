/*

24. Payment Gateway
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All
payments must implement a pay() method.
Problem Statement:
● Create an interface Payment → method pay(double amount)
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay()
implementation
● In main(), take payment amount and process payment using both methods
Sample Input:
CreditCardPayment → amount=2500
PayPalPayment → amount=1500
Sample Output:
Processing Credit Card Payment of 2500
Processing PayPal Payment of 1500

code:
*/

class Q24_PaymentGateway {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();

        p1.pay(2500);
        p1.pay(1500);
    }
}


interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q24_PaymentGateway
Processing Credit Card Payment of 2500.0
Processing Credit Card Payment of 1500.0
*/