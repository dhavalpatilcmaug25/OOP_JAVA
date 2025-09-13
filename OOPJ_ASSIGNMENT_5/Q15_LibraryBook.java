/*
Problem 15: Library Book Inventory
Use Case: Track available copies of books in a library system.
Requirements:
● Map book titles to available copies
● Update copies when books are borrowed
● Display current inventory
Sample Input:
Initial inventory: "Java" → 3, "Python" → 5
Borrow: "Java" (1 copy)
Expected Output:
Current inventory: Java:2, Python:5


code : 
 */


import java.util.*;
public class Q15_LibraryBook {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java" , 3);
        map.put("Python" , 5);

        String borrow = "Java";

        if(map.containsKey(borrow)){
            int available = map.get(borrow);
            if(available > 0){
                map.put(borrow, available-1);
            }
            else{
                System.out.println("No copies availble");
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}


/*
Output:
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q15_LibraryBook.java
Java 2
Python 5

 */