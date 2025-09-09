class Q22_VechileTypes{
	public static void main(String args[]){
		AmphibiousVehicle av = new AmphibiousVehicle("HydroCar");

        av.driveOnLand();
        av.driveOnWater();
	}
}

/*

22. Vehicle Types
Scenario: Vehicles can be Land or Water types. Some vehicles can operate on both.
Problem Statement:
● Interface LandVehicle → method driveOnLand()
● Interface WaterVehicle → method driveOnWater()
● Class AmphibiousVehicle implements both interfaces → provides both methods
Sample Input:
AmphibiousVehicle → name=HydroCar
Sample Output:
HydroCar → Driving on Land
HydroCar → Driving on water


code:
*/

interface LandVechile{
	void driveOnLand();
}

interface WaterVechile{
	void driveOnWater();
}

class AmphibiousVehicle implements LandVechile, WaterVechile{
	String name;

    AmphibiousVehicle(String name) {
        this.name = name;
    }

    public void driveOnLand() {
        System.out.println(name + " --> Driving on Land");
    }

    public void driveOnWater() {
        System.out.println(name + " --> Driving on Water");
    }
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q22_VechileTypes
HydroCar --> Driving on Land
HydroCar --> Driving on Water
*/