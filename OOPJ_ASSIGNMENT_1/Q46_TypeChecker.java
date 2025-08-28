/* 
46. Character Type Checker
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character.
Input:
Enter character: %
Output:
Special Character


Code: 
*/


import java.util.*;
public class Q46_TypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("Alphabet");
        }
        else if(ch == '@' || ch == '#' || ch == '%' || ch == '&' || ch == '*'){
            System.out.println("Special Character");
        }
        else{
            System.out.println("Digit");
        }
        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q46_TypeChecker.java
Enter character: %
Special Character

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q46_TypeChecker.java
Enter character: f
Alphabet

*/