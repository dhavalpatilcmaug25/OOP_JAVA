/* 
16. Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid
input.
Input:
Enter a character: e
Output:
Vowel



Code: 
*/


import java.util.*;
public class Q16_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Constant");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q16_Vowel.java 
Enter a character: e
Vowel

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q16_Vowel.java
Enter a character: d
Constant
*/