package Package;

public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		// Arithmetic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relational Operators
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical Operators
		boolean x=true; 
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y); 
		
		//Assignment Operators
		int c;
		
		c=a;
		System.out.println(c);
		
		c=b;
		System.out.println(-c);
		
		c=100;
		//c=c+1; 
		c++; //c=c+1; increment operator
		c--; //c=c-1; decrement operator
		c+=5; //c=c+5;
		c-=5; //c=c-5;
		System.out.println(c); 
	}

}
