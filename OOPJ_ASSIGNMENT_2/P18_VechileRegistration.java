/*
Problem 18: Vehicle Registration – Static Counter
Scenario:
Create Vehicle class with regNo, ownerName, vehicleType.
● Static variable: vehicleCount
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
C-DAC MUMBAI
● Create 2 vehicles, display registration details


 */

package OOPJ_ASSIGNMENT_2;

public class P18_VechileRegistration {
    public static void main(String[] args) {
       Vechile v1 = new Vechile("Dhaval", "Car");
       Vechile v2 = new Vechile("Rohit", "Bike");

       System.out.println("Vechile1: RegNo.: " + v1.getRegNo() + " Owner Name: " + v1.getOwnerName() + " Vechile Type: " + v1.getVechileType());
       System.out.println("Vechile2: RegNo.: " + v2.getRegNo() + " Owner Name: " + v2.getOwnerName() + " Vechile Type: " + v2.getVechileType());

    }
}

class Vechile{
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vechileCount = 1;

    Vechile(String ownerName, String vechileType){
        this.regNo = "MH-2025-"+ vechileCount++;
        this.ownerName = ownerName;
        this.vehicleType = vechileType;
    }

    public String getRegNo(){
        return regNo;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getVechileType(){
        return vehicleType;
    }

}


/*

Vechile1: RegNo.: MH-2025-1 Owner Name: Dhaval Vechile Type: Car
Vechile2: RegNo.: MH-2025-2 Owner Name: Rohit Vechile Type: Bike
 */