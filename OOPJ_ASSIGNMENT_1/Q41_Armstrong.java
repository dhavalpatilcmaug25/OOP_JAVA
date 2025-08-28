/* 
41. Check Armstrong Number (3-Digit)
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits =
number).
Input:
Enter number: 153
Output:
153 is an Armstrong number


Code: 
*/


import java.util.*;
public class Q41_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int orignal = num;
        int sum = 0;
        while(num > 0){
            int last = num % 10;
            last = last * last * last;
            sum += last;
            num = num/10;
        }
        if(orignal == sum){
            System.out.println(orignal + " is an Armstrong number");
        }
        else{

            System.out.println(orignal + " is not an Armstrong number");
        }   
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q41_Armstrong.java
Enter number: 153
153 is an Armstrong number

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q41_Armstrong.java
Enter number: 371
371 is an Armstrong number

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q41_Armstrong.java
Enter number: 155
155 is not an Armstrong number

*/