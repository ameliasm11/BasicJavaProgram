package Interfaces;

interface A{
	int a=10;
	
	void display();
}

interface B{
	int b=20;
	
	void show();
}


public class MultipleInheritanceExample implements A,B {
	
	@Override
	public void display() {
		System.out.println(a);
		
	}
	
	@Override
	public void show() {
		System.out.println(b);
		
	}


	public static void main(String[] args) {
		MultipleInheritanceExample mi = new MultipleInheritanceExample();
		mi.display();
		mi.show();

	}

	
}
