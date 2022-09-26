package Interfaces;

interface TestInter{
	int a=10; //by default the var is static and final
	void display(); //abstrack method
}



public class InterfaceExample implements TestInter {
	
	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		TestInter ie = new InterfaceExample();
		ie.display();

	}

}
