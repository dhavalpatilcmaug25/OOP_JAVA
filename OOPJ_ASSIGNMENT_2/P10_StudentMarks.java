/*
Problem 10: Student Marks Checker
Scenario:
Create a Student class with rollNo, name, and marks.
● Use a parameterized constructor to initialize all fields.
● Create a getter and setter for marks.
● In main, create one student, update marks using setter, and print student details.

 */

package OOPJ_ASSIGNMENT_2;

public class P10_StudentMarks {
    public static void main(String[] args) {
        Student s1 = new Student("Dhaval", 32, 98);

        System.out.println("Name: " + s1.getName() + " RollNo.: " + s1.getRollno() + " Marks: " + s1.getMarks());
        s1.setMarks(88); // marks updated using setter method
        System.out.println("Name: " + s1.getName() + " RollNo.: " + s1.getRollno() + " Marks: " + s1.getMarks());
    }
}

class Student{
    private String name;
    private int rollNo;
    private int marks;
    
    Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }

    public int getRollno(){
        return rollNo;
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P10_StudentMarks.java
Name: Dhaval RollNo.: 32 Marks: 98

Name: Dhaval RollNo.: 32 Marks: 88
 */