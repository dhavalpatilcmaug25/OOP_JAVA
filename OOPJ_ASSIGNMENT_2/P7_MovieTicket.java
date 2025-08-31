/*
Problem 7: Indian Movie Ticket Booking
Scenario:
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with
ticket type. Keep track of total tickets sold using a static counter.
Tasks:
1. Create a Customer class.
2. Implement two constructors:
Constructor 1 → Customer(String name)
Constructor 2 → Customer(String name, String ticketType)
3. Static counter to track tickets sold.
4. Print customer details and total tickets sold.
Input Example:
Customer1: "Rahul"
Customer2: "Pooja", "Premium"
Customer3: "Amit"
Expected Output:
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3
 
 */

package OOPJ_ASSIGNMENT_2;

public class P7_MovieTicket {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");
    
        System.out.println("Customer1: Name: " + c1.getName() + " Ticket: " + c1.getTicketType());
        System.out.println("Customer2: Name: " + c2.getName() + " Ticket: " + c2.getTicketType());
        System.out.println("Customer3: Name: " + c3.getName() + " Ticket: " + c3.getTicketType());

        Customer.showTotalTicketSold();

    }
}

class Customer{
    private String name;
    private String ticketType;
    private static int totalTicketSold;

    Customer(String name){
        this.name = name;
        this.ticketType = "Normal";
        totalTicketSold++;
    }

    Customer(String name, String ticketType){
        this.name = name;
        this.ticketType = ticketType;
        totalTicketSold++;
    }

    public String getName(){
        return name;
    }

    public String getTicketType(){
        return ticketType;
    }


    public static void showTotalTicketSold(){
        System.out.println("Total Tickets Sold: " + totalTicketSold);
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P7_MovieTicket.java 
Customer1: Name: Rahul Ticket: Normal
Customer2: Name: Pooja Ticket: Premium
Customer3: Name: Amit Ticket: Normal
Total Tickets Sold: 3
 */