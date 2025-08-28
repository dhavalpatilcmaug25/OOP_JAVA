/* 
18. Day of the Week
Scenario: Take day number (1–7) and print the day name.
Input:
Enter day number: 4
Output:
Day is Thursday




Code: 
*/


import java.util.*;
public class Q18_DayWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Monday");
                break;
            case 7:
                System.out.println("Day is Saturday");
                break;
        
            default:
            System.out.println("Invalid");
                break;
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q18_DayWeek.java 
Enter day number: 3
Day is Wednesday
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q18_DayWeek.java
Enter day number: 4
Day is Thursday
*/