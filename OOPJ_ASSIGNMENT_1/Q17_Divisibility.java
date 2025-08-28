/* 
17. Divisibility Check
Scenario: Check if a number is divisible by 2, 3, and 5 using nested if-else.
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5



Code: 
*/


import java.util.*;
public class Q17_Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        

        if(num % 2 == 0 && num%3==0 && num%5==0){
            System.out.println("Divisible by 2");
            System.out.println("Divisible by 3");
            System.out.println("Divisible by 5");
        }
        else if(num % 2 == 0 && num%3==0){
            System.out.println("Divisible by 2");
            System.out.println("Divisible by 3");
        }
        else{
            System.out.println("Divisible by 2");
        }

        
        

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q17_Divisibility.java
Enter number: 30
Divisible by 2
Divisible by 3
Divisible by 5
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q17_Divisibility.java
Enter number: 18
Divisible by 2
Divisible by 3
*/