/* 
44. Reverse 4-Digit Number and Palindrome Check
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
Input:
Enter 4-digit number: 1221
Output:
Reversed number: 1221
Palindrome: Yes



Code: 
*/


import java.util.*;
public class Q44_ReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int orignal =  num;
        int sum = 0;
        while(num > 0){
            int last = num % 10;
            sum = sum * 10 + last;
            num = num/10;
        }
        System.out.println("Reversed number "+sum);
        if(sum == orignal){
            System.out.println("Palindrome: Yes");
        }else{
            System.out.println("Palindrome: No");
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q44_ReversePalindrome.java
Enter 4-digit number: 1221
Reversed number 1221
Palindrome: Yes

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q44_ReversePalindrome.java
Enter 4-digit number: 1234
Reversed number 4321
Palindrome: No

*/