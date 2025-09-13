/*
Problem 21: Text Editor Undo System
Use Case: Implement undo functionality for a text editor.
Requirements:
● Track user actions in order
● Implement undo operation (LIFO)
● Display current action history
Sample Input:
Actions: "Type A", "Type B", "Delete"
Operation: Undo last action
Expected Output:
Current actions: Type A, Type B


code : 
 */


import java.util.*;
public class Q21_TextEditor {
    public static void main(String[] args) {
        String[] Actions = {"Type A", "Type B", "Delete"};
        Stack<String> st = new Stack<>();

        for(String action : Actions){
            st.push(action);
        }

        st.pop();

        System.out.println(String.join(", ", st));


    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q21_TextEditor.java
Type A, Type B

 */