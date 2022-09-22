package oop;

public class Calculations {
	
	int a;
	int b;
	
	//method may not takes parameters - empty parameters
	void sum() {
		System.out.println(a+b);
	}
	
	//method takes parameters
	void sum2(int x, int y) {
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
	//Method returns some value
	int sum3(){
		return(a+b);
	}

	public static void main(String[] args) {
		Calculations cal = new Calculations();
		cal.a=100;
		cal.b=200;
		cal.sum();
		
		//with parameters 
		Calculations cal2 = new Calculations();
		cal2.sum2(10, 5);
		
		//returs some value
		Calculations cal3 = new Calculations();
		cal3.a=200;
		cal3.b=200;
		int r=cal3.sum3();
		System.out.println(r);

	}

}
