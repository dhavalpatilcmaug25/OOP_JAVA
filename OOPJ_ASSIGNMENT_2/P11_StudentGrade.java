/*
Problem 11: Student Grade Calculator
Scenario:
Extend previous problem. Add method calculateGrade() which returns:
● "A" if marks ≥ 80
● "B" if marks ≥ 60
● "C" if marks ≥ 40
● "Fail" otherwise
● Create 2 students, print marks and grades.

 */

package OOPJ_ASSIGNMENT_2;

public class P11_StudentGrade {
    public static void main(String[] args) {
        Student s1 = new Student("Dhaval", 32, 88);
        Student s2 = new Student("Anjali", 30, 78);

        System.out.println("Name: " + s1.getName() + " RollNo.: " + s1.getRollno() + " Marks: " + s1.getMarks() + " Grade: " + s1.calculateGrade());
        System.out.println("Name: " + s2.getName() + " RollNo.: " + s2.getRollno() + " Marks: " + s2.getMarks() + " Grade: " + s2.calculateGrade());
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

    public String calculateGrade(){
        String grade;
        if(marks >= 80){
            grade = "A";
        }
        else if(marks >= 60){
            grade = "B";
        }
        else if(marks >= 40){
            grade = "C";
        }
        else{
            grade = "Fail";
        }
        return grade;
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
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P11_StudentGrade.java
Name: Dhaval RollNo.: 32 Marks: 88 Grade: A
Name: Anjali RollNo.: 30 Marks: 78 Grade: B
 */