/*
Problem 14: Report Title
Scenario: A report generation system needs to modify document titles by adding department names and
updating formatting.
Task: Use StringBuilder method chaining to efficiently modify report titles.
Sample Input:
Original title: Annual Report
Department Name: CDAC
Expected Output:
Annual CDAC Report

 */

import java.util.*;
public class Q14_ReportTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Original title: ");
        String str1 = sc.nextLine();
        
        System.out.println("Department Name: ");
        String str2 = sc.nextLine();

        int space = str1.indexOf(" ");
        StringBuilder sb = new StringBuilder(str1);

        sb.insert(space, " "  + str2);

        System.out.println(sb.toString());
    }
}


/* 

java Q14_ReportTitle.java
Original title: 
Annual Report
Department Name:
CDAC
Annual CDAC Report

 */