/* 
50. Divisibility by 2, 3, 5 with Custom Messages
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each.
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5


Code: 
*/


import java.util.*;
public class Q50_CustomMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // Check divisibility
        if (number % 2 == 0) {
            System.out.println("Divisible by 2");
        }

        if (number % 3 == 0) {
            System.out.println("Divisible by 3");
        }

        if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        // If not divisible by any
        if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
            System.out.println("Not divisible by 2, 3, or 5");
        }
        

    }
}


/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q50_CustomMessage.java
Enter number: 30
Divisible by 2
Divisible by 3
Divisible by 5

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q50_CustomMessage.java
Enter number: 28
Divisible by 2

*/