/* 
47. Even/Odd Status of Two Numbers
Scenario: Take two numbers and print if both are even, both odd, or mixed.
Input:
Enter first number: 12
Enter second number: 17
Output:
Numbers are mixed (one even, one odd)



Code: 
*/


import java.util.*;
public class Q47_EvenOddStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        if(n1 %2==0 && n2%2==0){
            System.out.println("Both are even");
        }
        else if(n1 %2!=0 && n2%2!=0){
            System.out.println("Both are odd");
        }
        else{
            System.out.println("Number are mixed(one even, oneodd)");
        }
        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q47_EvenOddStatus.java
Enter first number: 12
Enter second number: 17
Number are mixed(one even, oneodd)

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q47_EvenOddStatus.java    
Enter first number: 12
Enter second number: 16
Both are even
*/