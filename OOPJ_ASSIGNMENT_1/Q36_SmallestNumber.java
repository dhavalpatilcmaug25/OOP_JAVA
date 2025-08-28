/* 
36. Smallest of Three Numbers (Nested Ternary)
Scenario: Take three numbers as input and print the smallest using nested ternary operator.
Input:
Enter numbers: 12, 8, 19
Output:
Smallest number: 8


Code: 
*/


import java.util.*;
public class Q36_SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int num = (a < b && a < c) ? a : (b < c) ? b : c;

        System.out.println(num);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q36_SmallestNumber.java
Enter number: 12 8 19
8

*/