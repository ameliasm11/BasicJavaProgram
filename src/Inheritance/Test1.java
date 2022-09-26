package Inheritance;

 class A{
	 int a;
	 int b;
	 
	 public void display() {
		 System.out.println(a+b);
	 }
 }
 
 
 class B extends A{
	int x;
	int y;
	
	public void show() {
		System.out.println(x+y);
	}
 }
 
 class C extends B{
	 int p;
	 int q;
	 
	 public void addition() {
		 System.out.println(p+q);
	 }
 }

public class Test1 {

	public static void main(String[] args) {
		/*A aobj = new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();*/
		
		B bobj= new B();
		bobj.x=300;
		bobj.y=500;
		bobj.show();
		
		//class B can access everything from class A - single inheritance
		bobj.a=20;
		bobj.b=30;
		bobj.display();
		
		//Multi level inheritance
		C cobj = new C();
		cobj.a=10;
		cobj.b=20;
		cobj.x=30;
		cobj.y=40;
		cobj.p=50;
		cobj.q=60;
		
		cobj.display();
		cobj.show();
		cobj.addition();
		 
	}

}
