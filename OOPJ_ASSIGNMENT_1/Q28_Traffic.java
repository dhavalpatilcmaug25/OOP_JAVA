/* 
28. Traffic Signal Instruction
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.
Input:
Enter traffic light color: Green
Output:
Go

Code: 
*/


import java.util.*;
public class Q28_Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color: ");
        String str = sc.next();

        String character;
        switch (str) {
            case "Green":
                character = "GO";
                break;
            case "Yellow":
                character = "Ready";
                break;
            case "Red":
                character = "Stop";
                break;
            default:
                character = "Invalid";
                break;
        }
        System.out.println(character);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q28_Traffic.java
Enter traffic light color: Green
GO

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q28_Traffic.java
Enter traffic light color: Red
Stop
*/