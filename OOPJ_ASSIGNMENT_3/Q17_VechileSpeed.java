/*

17. Vehicle Speed Display
Scenario: Vehicle management system needs to display speed differently for different vehicle types.
Problem Statement:
Create class Vehicle with method displaySpeed(). Subclass Car and Bike override it.
Classes/Fields:
● Vehicle → displaySpeed() prints “Vehicle speed unknown”
● Car → overrides displaySpeed() → “Car speed 120 km/h”
● Bike → overrides displaySpeed() → “Bike speed 80 km/h”
Sample Input:
Car
Bike
Sample Output:
Car speed 120 km/h
Bike speed 80 km/h


code:
*/


class Q17_VechileSpeed{
	public static void main(String args[]){
		Vechile v1 = new Car();
		Vechile v2 = new Bike();
		
		v1.displaySpeed();
		v2.displaySpeed();
	}
}

class Vechile{

	void displaySpeed(){
		System.out.println("Vechile speed is unknown");
	}
}

class Car extends Vechile{
	
	void displaySpeed(){
		System.out.println("Car speed 120 km/h");
	}
}

class Bike extends Vechile{
	
	void displaySpeed(){
		System.out.println("Bike speed 80 km/h");
	}
}
	
	
	/*
	Output: 
	
Car speed 120 km/h
Bike speed 80 km/h

	*/