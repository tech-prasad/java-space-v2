
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

public class Test {
	
	public static void main(String[] arr){
		
		// how many steps happened here? What happened here?
		// Step 1: Object creation started
		// Step 2: Memory allocated child class instance variables and parent class instance variables
		// Step 3: Child constructor called and parent class constructor called and initialized both child and parent class instance variables
		// Step 4: Object creation completed
		// Step 5: Object placed in child class reference variable
		Bharath b = new Bharath();
		
		// What happened here?
		// Step 1: With child class reference, we called driveCar() method
		// Step 2: Control will go to child class and look for method driveCar()
		// Step 3: as the method does not exist in child, JVM checks if any Inheritance relationship.
		// Step 4: as the Inheritance relationship exist, Control will go parent class and look for method drive car
		// Step 5: as the method driveCar exist in parent class, method will be executed.
		b.driveCar();
		
		// What happened here?
		// Step 1: With child class reference, we called driveBike() method
		// Step 2: Control will go to child class and look for method driveBike()
		// Step 3: as the method driveBike method exist, method will be executed
		b.driveBike();		
	}	
}	