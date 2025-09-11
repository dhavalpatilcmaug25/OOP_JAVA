/*
Problem 22: Student Object Cleanup
Scenario: A student management system creates student objects during registration. When these objects
are no longer needed, the system should clean up resources before garbage collection.
Task: Override finalize method to demonstrate cleanup during garbage collection.
Sample Input:
Student Name: Amit
Expected Output:
Student object for Amit is being garbage collected

*/



import java.util.*;
public class Q22_StudentObject {
    private String name;

    public Q22_StudentObject(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Q22_StudentObject s1 = new Q22_StudentObject("Amit");
        s1 = null;

        System.gc();
        
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}



/* 



 */