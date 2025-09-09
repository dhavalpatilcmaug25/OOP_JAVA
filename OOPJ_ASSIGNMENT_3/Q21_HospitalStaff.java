class Q21_HospitalStaff{
	public static void main(String args[]){
		 Doctor d = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse n = new Nurse("Nisha", 102, "Night");

        d.displayDetails();
        n.displayDetails();
	}
}

class Staff{
	String name;
	int staffId;
	
	Staff(String name, int staffId){
		this.name = name;
		this.staffId = staffId;
	}
	
	void displayDetails(){
		System.out.println(name +"  Staff ID= " + staffId);
	}
}

class Doctor extends Staff{
	String specialization;
	
	Doctor(String name, int staffId, String specialization){
		super(name, staffId);
		this.specialization = specialization;
	}
	
	void displayDetails(){
		System.out.println(name +"  Staff ID= " + staffId + ", specialization=" + specialization);
	}
}

class Nurse extends Staff{
	String shift;
	
	Nurse(String name, int staffId, String shift){
		super(name, staffId);
		this.shift = shift;
	}
	
	void displayDetails(){
		System.out.println(name +"  Staff ID= " + staffId + ", shift=" + shift);
	}
	
}


/*

Dr. Reddy  Staff ID= 101, specialization=Cardiology
Nisha  Staff ID= 102, shift=Night

*/