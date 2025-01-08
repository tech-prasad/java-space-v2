class Anil {
	
	String car;
	
	Anil() {
		car = "Kia";
	}
	
	void driveCar(){
		System.out.println("Driving car: "+ car);
	}
}

class Bharath extends Anil {
	
	String bike;
	
	Bharath(){
		bike = "Pulser";
	}
	
	void driveBike(){
		System.out.println("Drive bike: "+ bike);
	}	
}

class Chandu extends Bharath {

	String phone;
	
	Chandu(){
		phone = "Apple";
	}
	
	void useTab(){
		System.out.println("Using tab: MI Tab");
	}
	
	void usePhone(){		
		System.out.println("Using phone: "+ phone);
		
		useTab();
		
		driveCar();
	}
}

public class MultiLevelInheritance {

	public static void main(String[] array) {
		
		Chandu reference = new Chandu();
		
		reference.driveBike();
		
		reference.driveCar();
		reference.driveCar();
		reference.driveCar();	
		
		reference.usePhone();	
	
	}	
}

