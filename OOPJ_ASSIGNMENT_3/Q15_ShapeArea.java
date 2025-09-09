/*

15. Shape Area Calculation
Scenario: A program needs to calculate the area of different shapes using the same method name but
different parameters.
Problem Statement:
Create a class ShapeArea with overloaded methods calculateArea().
Methods:
● calculateArea(int side) → calculates area of square
● calculateArea(int length, int breadth) → calculates area of rectangle
● calculateArea(double radius) → calculates area of circle
Sample Input:
Square → side=5
Rectangle → length=4, breadth=6
Circle → radius=3
Sample Output:
Square Area = 25
Rectangle Area = 24
Circle Area = 28.26


code:
*/


class Q15_ShapeArea{
	public static void main(String args[]){
		ShapeArea s1 = new ShapeArea();
		
		s1.calculateArea(5);
		s1.calculateArea(4,6);
		s1.calculateArea(3.0f);
		
	}
}

class ShapeArea{
	
	void calculateArea(int side){
		System.out.println("Square Area = " + side * side);
	}
	
	void calculateArea(int length, int breath){
		System.out.println("Rectangle Area= " + length * breath);
	}
	
	void calculateArea(float radius){
		System.out.println("Circle Area = " + 3.14 * radius * radius);
	}
}
	
	
	/*
	C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q15_ShapeArea
Square Area = 25
Rectangle Area= 24
Circle Area = 28.259999999999998
	*/