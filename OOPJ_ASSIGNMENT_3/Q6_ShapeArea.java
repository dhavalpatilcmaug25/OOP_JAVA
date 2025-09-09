/*

6. Shape Area Calculation
Scenario: You are designing a program to calculate areas of different shapes.
Problem Statement:
Create a superclass Shape with a method area(). Derive two subclasses Rectangle and Circle. Implement
area() in each subclass.
Classes/Fields:
● Shape → area() (method stub)
● Rectangle → length, breadth
● Circle → radius
Methods:
● Rectangle.area() → length × breadth
● Circle.area() → π × radius²
Sample Input:
Rectangle → length=5, breadth=10
Circle → radius=7
Sample Output:
Rectangle Area = 50
Circle Area = 153.86


code:
*/

class Q6_ShapeArea{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle(5,10);
		Circle c1 = new Circle(7);
		
		System.out.println("Rectangle Area = " + r1.area());
		System.out.println("Circle Area = " + c1.area());
	}
}

abstract class Shape{
	abstract double area();
}

class Rectangle extends Shape{
	private double length;
	private double breath;
	
	Rectangle(int length, int breath){
		this.length = length;
		this.breath = breath;
	}
	
	double area(){
		return length * breath;
	}
}

class Circle extends Shape{
	private double pie = 3.14;
	private double radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	double area(){
		return pie * (radius * radius);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q6_ShapeArea
Rectangle Area = 50.0
Circle Area = 153.86
*/