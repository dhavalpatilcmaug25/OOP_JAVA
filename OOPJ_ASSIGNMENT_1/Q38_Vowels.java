/* 
38. Vowel or Consonant (Ternary)
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.
Input:
Enter character: i
Output:
Vowel


Code: 
*/


import java.util.*;
public class Q38_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char a = sc.next().charAt(0);

        String vowel = (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') ? "Vowel" : "Not Vowel";

        System.out.println(vowel);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q38_Vowels.java
Enter character: i
Vowel

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q38_Vowels.java
Enter character: r
Not Vowel

*/