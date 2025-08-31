/*
Problem 9: School Fee System
Scenario:
A school wants to initialize the tuition fee for all students once at program start. Each student has name
and class. Use static blocks to set the fee and setters/getters to update/access student information.
Tasks:
1. Create a Student class.
2. Use a static block to initialize tuitionFee to 30000.
3. Create instance variables: name (String) and className (String).
4. Create setters and getters for name and className.
5. Print student details including tuition fee.
Input Example:
Student1: Name="Anjali", Class="10th"
Student2: Name="Vikram", Class="12th"
Expected Output:
School Tuition Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Tuition Fee=30000
Student2: Name=Vikram, Class=12th, Tuition Fee=30000

 
 */

package OOPJ_ASSIGNMENT_2;

public class P9_SchoolFee {
    public static void main(String[] args) {
        Student s1 = new Student("Anjali", "10th");
        Student s2 = new Student("Vikram", "12th");
        
        System.out.println("Student1: Name="+s1.getName()+", Class=" + s1.getClassName()+ ", Interest Rate="+ Student.tuitionFee);
        System.out.println("Student1: Name="+s2.getName()+", Class=" + s2.getClassName()+ ", Interest Rate="+ Student.tuitionFee);
    }
}

class Student{
    private String name;
    private String className;
    static int tuitionFee;
    
    static{
        tuitionFee = 30000;
        System.out.println("School Tution Fee Initialized: " + tuitionFee);
    }

    Student(String name, String className){
        this.name = name;
        this.className = className;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getClassName(){
        return className;
    }
    public void setClassName(String className){
        this.className = className;
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P9_SchoolFee.java  
School Tution Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Interest Rate=30000
Student1: Name=Vikram, Class=12th, Interest Rate=30000
 */