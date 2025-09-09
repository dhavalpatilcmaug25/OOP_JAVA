/*

13. Shape Drawing
Scenario: A graphics program needs to draw different shapes.
Problem Statement:
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement
draw().
Classes/Fields:
● Shape → draw() (abstract)
● Circle → radius
● Rectangle → length, breadth
Sample Input:
Circle → radius=7
Rectangle → length=5, breadth=10
Sample Output:
Drawing Circle of radius 7
Drawing Rectangle of length 5 and breadth 10


code:
*/


class Q13_ShapeDrawing{
	public static void main(String args[]){
		Shape s1 = new Circle(7);
		Shape s2 = new Rectangle(5, 10);
		
		s1.draw();
		s2.draw();
	}
}

abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	void draw(){
		System.out.println("Drawing Circle of radius " + radius);
	}
}

class Rectangle extends Shape{
	int length;
	int breath;
	
	Rectangle(int length, int breath){
		this.length = length;
		this.breath = breath;
	}
	
	void draw(){
		System.out.println("Drawing Rectangle of length " + length + " and breath " + breath);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q13_ShapeDrawing
Drawing Circle of radius 7
Drawing Rectangle of length 5 and breath 10
*/