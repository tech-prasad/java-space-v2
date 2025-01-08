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

class Chandu extends Anil {

	String phone;
	
	Chandu(){
		phone = "Apple";
	}	
	
	void usePhone(){		
		System.out.println("Using phone: "+ phone);		
	}
}

public class HierarchicalInheritance{
	
	public static void main(String[] a) {
	
		Bharath bReference = new Bharath();
		
		bReference.driveCar();
		bReference.driveBike();
		
		Chandu cReference = new Chandu();
		
		cReference.driveCar();
		cReference.usePhone();		
	}
}