package oop;

public class MethodOverloading {
	int a;
	int b;
	
	void sum() { //First
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
//	void sum(int x, int y) { //second
//		int a=x;
//		int b=y;
//		System.out.println(a+b);
//	}
	
	void sum(int a, int b) { //second
		this.a=a; //this keyword 
		this.b=b;
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z) { //third
		System.out.println(x+y+z); 
		
	}
	
	void sum(int x, double y) { //fourth
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum(); //call first method
		mo.sum(100, 200); //call second method
		mo.sum(10, 20, 30); //call third method
		mo.sum(10, 10.5); //call fourth method
	}

}
