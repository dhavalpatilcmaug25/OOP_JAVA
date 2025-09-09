/*

18. Payment Process
Scenario: Company wants to process payments differently depending on mode of payment, but handle all
payments through a single reference.
Problem Statement:
Create abstract class Payment with abstract method pay(). Subclass CreditCardPayment and UPIPayment
implement pay().
Usage:
● Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...)
● Call p.pay() for runtime polymorphic behavior
Sample Input:
Credit Card → cardNumber=1234567890123456, amount=5000
UPI → upiId=rahul@upi, amount=2000
Sample Output:
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid
Payment via UPI rahul@upi → Rs. 2000 Paid


code:
*/


class Q18_PaymentProcess{
	public static void main(String args[]){
		Payment c1 = new CreditCardPayment(1234567890123456L, 5000);
		Payment p1 = new UPIPayment("rahul@upi", 2000);
		
		c1.pay();
		p1.pay();
	}
}

abstract class Payment{
	abstract void pay();
}

class CreditCardPayment extends Payment{
	long cardNumber;
	int amount;
	
	CreditCardPayment(long cardNumber, int amount){
		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	
	void pay(){
		System.out.println("Payment via Credit Card " + cardNumber + " ---> Rs. " + amount + " Paid");
	}
}

class UPIPayment extends Payment{
	String upiId;
	int amount;
	
	UPIPayment(String upiId, int amount){
		this.upiId = upiId;
		this.amount = amount;
	}
	
	void pay(){
		System.out.println("Payment via UPI "+ upiId + " ---> Rs. " + amount + " Paid");
	}
}	

/*

Payment via Credit Card 1234567890123456 ---> Rs. 5000 Paid
Payment via UPI rahul@upi ---> Rs. 2000 Paid

*/