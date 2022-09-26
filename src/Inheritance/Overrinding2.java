package Inheritance;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running");
	}
}

public class Overrinding2 {

	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.run();
		
//		Bike b = new Bike();
//		b.run();

	}

}
