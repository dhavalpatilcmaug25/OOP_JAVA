/*
Problem 22: Ticket Booking Queue
Use Case: Manage customer service in a ticket booking system.
Requirements:
● Queue customers for service
● Serve customers in FIFO order
● Display current queue status
Sample Input:
Queue: "Amit", "Priya", "Rohan"
Serve: 1 customer
Expected Output:
Serving: Amit, Queue: Prita, Rohan


code : 
 */


import java.util.*;
public class Q22_TicketBooking {
    public static void main(String[] args) {
        String[] Queues = {"Amit", "Priya", "Rohan"};
        Queue<String> q = new LinkedList<>();

        for(String qu : Queues){
            q.add(qu);
        }

		int customer = 1;
		
		String Served = null;
		
		for(int i=0; i<customer; i++){
			if(!q.isEmpty()){
				Served = q.poll();
			}
		}
		
		System.out.print("Serving: " + Served + ", Queue:");
        System.out.println(String.join(", ", q));


    }
}


/*
Output:

C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q22_TicketBooking
Serving: Amit, Queue:Priya, Rohan

 */