/* 
27. Print Message Based on Character (A–E)
Scenario: Take a character (A–E) and print a specific message using switch-case.
Input:
Enter a character: B
Output:
You selected option B.


Code: 
*/


import java.util.*;
public class Q27_MessageChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String character;
        switch (ch) {
            case 'A':
                character = "A";
                break;
            case 'B':
                character = "B";
                break;
            case 'C':
                character = "C";
                break;
            case 'D':
                character = "D";
                break;
            case 'E':
                character = "E";
                break;
            default:
                character = "Invalid";
                break;
        }
        System.out.println("You selected option " + character);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q27_MessageChar.java
Enter a character: B
You selected option B
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q27_MessageChar.java
Enter a character: E
You selected option E
*/