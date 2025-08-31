/*
Problem 5: Student Marks Calculator
Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in
the class.
Requirements:
1. Create a class Student with instance variables: name (String), marks (int).
2. Create static variable totalStudents to count total number of students.
3. Constructor to initialize student details and increment totalStudents.
4. Getter and Setter for marks.
5. Method isPassed() returns true if marks >= 35, false otherwise.
6. Static method showTotalStudents() prints total students.
7. In main class, create 3 students, check if they passed, and show total students.
Input Example:
Student1: Name: "Rahul", Marks: 78
Student2: Name: "Pooja", Marks: 34
Student3: Name: "Amit", Marks: 65
Expected Output:
Student Rahul Passed? true
Student Pooja Passed? false
Student Amit Passed? true
Total students: 3

 
 */

package OOPJ_ASSIGNMENT_2;

public class P5_StudentMarks {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 78);
        Student s2 = new Student("Pooja", 34);
        Student s3 = new Student("Amit", 65);

        System.out.println("Student " + s1.getName() + " Passed? " + s1.isPassed());
        System.out.println("Student " + s2.getName() + " Passed? " + s2.isPassed());
        System.out.println("Student " + s3.getName() + " Passed? " + s3.isPassed());

        Student.showTotalStudents();

    }
}

class Student{
    private String name;
    private int marks;
    private static int totalStudent;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
        totalStudent++;
    }

    public String getName(){
        return name;
    }

    public int marks(){
        return marks;
    }

    public boolean isPassed(){
        if(marks >= 35){
            return true;
        }
        else{
            return false;
        }
    }

    public static void showTotalStudents(){
        System.out.println("Total Students: " + totalStudent);
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P5_StudentMarks.java
Student Rahul Passed? true
Student Pooja Passed? false
Student Amit Passed? true
Total Students: 3
 */