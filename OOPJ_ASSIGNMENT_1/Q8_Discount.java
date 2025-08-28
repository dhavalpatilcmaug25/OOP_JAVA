/* 
8. Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount
as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080



Code: 
*/


import java.util.*;
public class Q8_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount: ");
        int total = sc.nextInt();
        
        if(total > 1000){
            double discount = total - (total * 0.10);
            System.out.println("Final cost after discount: " + discount);
        }
        else{
            System.out.println("Final cost " + total);
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q8_Discount.java
Enter total purchase amount: 800
Final cost 800

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q8_Discount.java
Enter total purchase amount: 1200
Final cost after discount: 1080.0
*/