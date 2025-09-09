/*

5. Temperature Sensor
Scenario: Sensor should only accept temperatures in safe range.
Problem Statement:
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C.
Fields:
● private int temperature
Methods:
● setTemperature(int t) → only 0–100 valid
● getTemperature() → return temperature
Sample Input:
temperature = -5
Sample Output:
“Temperature out of range”



code:
*/


class Q5_TemperatureSensor{
	public static void main(String args[]){
		TemperatureSensor t1 = new TemperatureSensor();
		
		t1.setTemperature(-5);
		
		if(t1.getTemperature() == 0){
			System.out.println("Temperature out of range");
		}else{
			System.out.println("Temperature is " + t1.getTemperature());
		}
	}
}

class TemperatureSensor{
	private int temperature;
	
	public void setTemperature(int t){
		if(t >= 0 && t <= 100){
			this.temperature = temperature;
		}
	}
	
	public int getTemperature(){
		return temperature;
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q5_TemperatureSensor
Temperature out of range
*/