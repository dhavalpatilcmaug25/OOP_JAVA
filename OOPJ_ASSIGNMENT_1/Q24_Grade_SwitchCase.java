/* 
24. Grade Using Switch (Ranges)
Scenario: Take marks (0–100) and print grade using switch-case grouping:
● 0–24 → F
● 25–44 → E
● 45–54 → D
● 55–69 → C
● 70–84 → B
● 85–100 → A
Input:
Enter marks: 78
Output:
Grade: B



Code: 
*/


import java.util.*;
public class Q24_Grade_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int mark = sc.nextInt();

        
        switch (mark/10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 5:
            case 6:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D");
                break;
            case 3:
            case 2:
                System.out.println("Grade: E");
                break;
            case 1:
            case 0:
                System.out.println("Grade: F");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q24_Grade_SwitchCase.java
Enter Marks: 78
Grade: B
*/