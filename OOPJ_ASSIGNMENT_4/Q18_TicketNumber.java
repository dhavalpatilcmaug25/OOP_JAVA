/*
Problem 18: Ticket Number Verification
Scenario: A ticketing system generates verification codes by reversing ticket numbers for security
purposes.
Task: Use StringBuffer to create verification codes.
Sample Input:
12345
Expected Output:
54321


*/

import java.util.*;
public class Q18_TicketNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        StringBuffer s = new StringBuffer(num);

        s.reverse();
        System.out.println(s.toString());
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q18_TicketNumber.java
12345
54321

 */