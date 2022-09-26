package Interfaces;

final class Test{ //final class can't be override/extends to another class
	
	final int a=10; //value of final var can't be change
	
	final void m1() { //final method can't be override
		System.out.println(a); 
	}
}

/*class Test123 extends Test{
	void m1() { //this is not valid because m1 is final method
		System.out.println("m1 is overriden");
	}
}*/

public class FinalExample {

	public static void main(String[] args) {
		

	}

}
