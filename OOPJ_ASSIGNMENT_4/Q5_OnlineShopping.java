/*
Problem 5: Online Shopping
Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price).
The system needs to handle invalid quantities and accessing non-existent products.
Task: Create an order processing method that handles multiple exception types.
Sample Input:
0
3
299.99 499.99 199.99
5
Expected Output:
Arithmetic Exception caught
or
Array Index Exception
C-DAC Mumbai

 */

 import java.util.*;
public class Q5_OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int n = sc.nextInt();
        double[] order = new double[n];
        
        for (int i = 0; i < n; i++) {
            order[i] = sc.nextDouble();
        }

        int idx = sc.nextInt();

        try {

            double unit = order[idx];

            double totalPrice = unit * n;
            System.out.println("Total price = " + totalPrice);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught");
        }
    }
}

/* 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q5_OnlineShopping.java
0
3
299.99 499.99 199.99
5
Array Index Exception
 */