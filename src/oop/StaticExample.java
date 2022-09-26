package oop;

public class StaticExample {
	
	int a; //non static var
	static int b; //static var
	
	//static method
	static void m1() {
		System.out.println("this is m1 - static method");
	}
	
	
	//non static method
	void m2() {
		System.out.println("this is m1 - non static method");
	}
	
	void m3() {
		a=500;
		b= 300;
		
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		//static methods can access static stuff only
		b=100;
		System.out.println(b);
		m1();
		
		//a=200; //not accessible, cause this is not static var
		//m2(); //not accessible, cause this is not static method
		
		//Static method can also access non static stuff through object
		StaticExample se= new StaticExample();
		se.a=200;
		System.out.println(se.a);
		se.m2();
		

	}

}
