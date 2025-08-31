/*
Problem 6: Indian Railway Ticket Booking
Scenario:
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and
age or name, age, and seat type. The system should also count the total tickets booked using a static
counter.
Tasks:
1. Create a Passenger class.
2. Implement two constructors (constructor overloading):
Constructor 1 → Passenger(String name, int age)
Constructor 2 → Passenger(String name, int age, String seatType)
3. Use a static counter to keep track of total passengers booked.
4. Print passenger details and total passengers.
Input Example:
Passenger1: "Ravi", 25
Passenger2: "Anita", 30, "AC Sleeper"
Passenger3: "Suresh", 40
Expected Output:
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers Booked: 3
 
 */

package OOPJ_ASSIGNMENT_2;

public class P6_RailwayTicket {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        System.out.println("Passenger1: Name: " + p1.getName() + " Age: " + p1.getAge() + " Seat: " + p1.getSeatType());
        System.out.println("Passenger2: Name: " + p2.getName() + " Age: " + p2.getAge() + " Seat: " + p2.getSeatType());
        System.out.println("Passenger3: Name: " + p3.getName() + " Age: " + p3.getAge() + " Seat: " + p3.getSeatType());

        Passenger.showTotalPassenger();

    }
}

class Passenger{
    private String name;
    private int age;
    private String seatType;
    private static int totalPassenger;

    Passenger(String name, int age){
        this.name = name;
        this.age = age;
        this.seatType = "General";
        totalPassenger++;
    }

    Passenger(String name, int age, String seatType){
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassenger++;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSeatType(){
        return seatType;
    }


    public static void showTotalPassenger(){
        System.out.println("Total Passenger Booked: " + totalPassenger);
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P6_RailwayTicket.java
Passenger1: Name: Ravi Age: 25 Seat: General
Passenger2: Name: Anita Age: 30 Seat: AC Sleeper
Passenger3: Name: Suresh Age: 40 Seat: General
Total Passenger Booked: 3
 */