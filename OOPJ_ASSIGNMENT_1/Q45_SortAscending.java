/* 
45. Sort Three Numbers in Ascending Order
Scenario: Take three numbers and print them in ascending order.
Input:
Enter numbers: 45, 12, 78
Output:
Ascending order: 12, 45, 78


Code: 
*/


import java.util.*;
public class Q45_SortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int first, second, third;
        
        if(a <= b && a <= c){
            first = a;
            if(b <= c ){
                second = b;
                third = c;
            }else{
                second = c;
                third = b;
            }
        }else if(b <= a && b <= c){
            first = b;
            if(a <= c) {
                second = a;
                third = c;
            }
            else{
                second = c;
                third = a;
            }
        }else{
            first = c;
            if(a <= b){
                second = a;
                third = b;
            }else{
                second = b;
                third = a;
            }
        }
        System.out.println("Ascending order: "+ first +", " + second+", "+ third);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q45_SortAscending.java    
Enter 3 number: 45 12 78
Ascending order: 12, 45, 78

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q45_SortAscending.java
Enter 3 number: 23 12 4
Ascending order: 4, 12, 23

*/