/*

27. Shape Area Calculator
Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and
Square.
Problem Statement:
● Interface Shape → method calculateArea()
● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation
● In main(), create objects of each shape, input dimensions, display calculated area
Sample Input:
Circle → radius=5
Rectangle → length=10, breadth=5
Square → side=4
Sample Output:
Circle Area = 78.5
Rectangle Area = 50
Square Area = 16


code:
*/


class Q27_ShapeArea {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(4);

        circle.calculateArea();
        rectangle.calculateArea();
        square.calculateArea();
    }
}

interface Shape {
    void calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area = " + area);
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public void calculateArea() {
        double area = side * side;
        System.out.println("Square Area = " + area);
    }
}


/*

C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q27_ShapeArea
Circle Area = 78.5
Rectangle Area = 50.0
Square Area = 16.0

*/