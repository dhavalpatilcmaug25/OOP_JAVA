/* 
40. Discount on Purchase (Ternary)
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total
cost using ternary.
Input:
Enter purchase amount: 1200
Output:
Total cost after discount: 1080


Code: 
*/


import java.util.*;
public class Q40_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();

        double discount = (amount > 1000) ? amount - amount*0.10 : amount;

        System.out.println(discount);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q40_Discount.java
Enter purchase amount: 1200
1080.0

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q40_Discount.java
Enter purchase amount: 2300
2070.0

*/