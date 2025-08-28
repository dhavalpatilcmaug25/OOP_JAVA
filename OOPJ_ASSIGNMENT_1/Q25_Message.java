/* 
25. Message Based on Number (1–5)
Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu
selection.
Input:
Enter a number: 3
Output:
You selected option 3


Code: 
*/


import java.util.*;
public class Q25_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        switch (num) {
            case 1:
                System.out.println("You Selected option 1");
                break;
            case 2:
                System.out.println("You Selected option 2");
                break;
            case 3:
                System.out.println("You Selected option 3");
                break;
            case 4:
                System.out.println("You Selected option 4");
                break;
            case 5:
                System.out.println("You Selected option 5");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q25_Message.java
Enter a number: 3
You Selected option 3

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q25_Message.java
Enter a number: 2
You Selected option 2
*/