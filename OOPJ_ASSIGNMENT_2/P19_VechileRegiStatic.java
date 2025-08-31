/*
Problem 19: Vehicle Registration – Static Block
Scenario:
Add a static block to Vehicle class:
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads
● Verify that the message prints only once when multiple vehicles are created

 */

package OOPJ_ASSIGNMENT_2;

public class P19_VechileRegiStatic {
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

    static{
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

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