/*
Problem 13: Order Number Display
Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order
for verification purposes.
Task: Use StringBuilder to reverse order numbers.
Sample Input:
INV2025
Expected Output:
5202VNI

 */

import java.util.*;
public class Q13_OrderNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        StringBuilder sb = new StringBuilder(str1);

        sb.reverse();
        System.out.println(sb.toString());
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q13_OrderNumber.java
INV2025
5202VNI

 */