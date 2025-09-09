/*

8. Vehicle Types
Scenario: You want to categorize vehicles.
Problem Statement:
Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType.
Display details of each vehicle.
Classes/Fields:
● Vehicle → brand, speed
● Car → modelType
● Bike → modelType
Sample Input:
Car → brand=Honda, speed=180, modelType=Civic
Bike → brand=Yamaha, speed=120, modelType=R15
Sample Output:
Car → Honda Civic, Speed=180
Bike → Yamaha R15, Speed=120


code:
*/

class Q8_VechileTypes{
	public static void main(String args[]){
		Car c1 = new Car("honda", 180, "Civic");
		Bike b1 = new Bike("Yamaha", 120, "R15");
		c1.displayDetails();
		b1.displayDetails();
	}
}

class Vechile{
	String brand;
	int speed;
	
	Vechile(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	void displayDetails(){
		System.out.println(brand +  ", Speed = " + speed);
	}
}

class Car extends Vechile{
	String modelType;
	
	Car(String brand, int speed, String modelType){
		super(brand, speed);
		this.modelType = modelType;
	}
	
	void displayDetails(){
		System.out.println(brand + " "+ modelType +   ", Speed = " + speed);
	}
}

class Bike extends Vechile{
	String modelType;
	
	Bike(String brand, int speed, String modelType){
		super(brand, speed);
		this.modelType = modelType;
	}
	void displayDetails(){
		System.out.println(brand + " "+ modelType +   ", Speed = " + speed);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q8_VechileTypes
honda Civic, Speed = 180
Yamaha R15, Speed = 120
*/