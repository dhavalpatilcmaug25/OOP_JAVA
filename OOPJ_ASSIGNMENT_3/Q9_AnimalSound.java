/*

9. Animal Sound
Scenario: You are building a zoo management system to play animal sounds.
Problem Statement:
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound().
Classes/Fields:
● Animal → makeSound()
● Dog → “Bark”
● Cat → “Meow”
Sample Output:
Dog → Bark
Cat → Meow



code:
*/

class Q9_AnimalSound{
	public static void main(String args[]){
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		d1.makeSound();
		c1.makeSound();
	}
}

class Animal{
	void makeSound(){
		System.out.println("Animal making sound");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Bark");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Meow");
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q9_AnimalSound
Bark
Meow
*/