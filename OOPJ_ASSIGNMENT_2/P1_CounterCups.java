/*
Problem 1: Counter for Cups
Scenario: You are keeping track of how many cups of tea are prepared in your home.
Requirements:
1. Create a class TeaCup with instance variable: teaType (String).
2. Create a static variable totalCups to count all cups created.
3. Constructor should initialize teaType and increment totalCups.
4. Create getter for teaType.
5. Create a static method showTotalCups() to print total cups.

Input Example:
Cup1: teaType = "Masala Tea"
Cup2: teaType = "Green Tea"
Cup3: teaType = "Ginger Tea"

Expected Output:
Cup1 type: Masala Tea
Cup2 type: Green Tea
Cup3 type: Ginger Tea
Total cups made: 3

 */

package OOPJ_ASSIGNMENT_2;

public class P1_CounterCups{
    public static void main(String args[]){
        TeaCup c1 = new TeaCup("Masala Tea");
        TeaCup c2 = new TeaCup("Green Tea");
        TeaCup c3 = new TeaCup("Ginger Tea");
        System.out.println("Cup1: teaType = "+c1.getTeaType());
        System.out.println("Cup2: teaType = "+c2.getTeaType());
        System.out.println("Cup3: teaType = "+c3.getTeaType());
        TeaCup.showTotalCups();
    }
}

class TeaCup{
    private String teaType;
    private static int totalCups;

    TeaCup(String teaType){
        this.teaType = teaType;
        totalCups++;
    }

    public String getTeaType() {
        return teaType;
    }

    public static void showTotalCups(){
        System.out.println("Total cups made: "+totalCups);
    }
}

/*
 * 
 * Output :
 * 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P1_CounterCups.java
Cup1: teaType = Masala Tea
Cup2: teaType = Green Tea
Cup3: teaType = Ginger Tea
Total cups made: 3
 */