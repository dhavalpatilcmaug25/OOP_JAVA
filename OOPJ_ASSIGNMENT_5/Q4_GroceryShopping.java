/*
Problem 4: Grocery Shopping List
Use Case: A person maintains a grocery list and removes items as they purchase them.
Requirements:
● Add items to grocery list
● Remove purchased items
● Display remaining items
Sample Input:
Add items: "Milk", "Eggs", "Bread"
Purchase: "Milk"
Expected Output:
Items to buy: Eggs, Bread


code : 
 */


import java.util.*;
public class Q4_GroceryShopping {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add("Milk");
        a.add("Eggs");
        a.add("Bread");
        System.out.println("Add items: " + a);
        String purchase = "Milk";
        System.out.println("Purchase: " + purchase);

        System.out.print("Item to buy: ");
        a.remove(purchase);
        for(String item : a){
            System.out.print(item + " ");
        }
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q4_GroceryShopping.java
Add items: [Milk, Eggs, Bread]
Purchase: Milk
Item to buy: Eggs Bread
 */