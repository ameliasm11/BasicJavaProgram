package oop;

public class ConstructureOverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	ConstructureOverloading(){ //First
		a=10;
		b=20;
		c=20.5;
	}
	
	ConstructureOverloading(int x, int y){ //Second
		a=x;
		b=y;
	}
	
	ConstructureOverloading(int x, double y){ //Third
		a=x;
		c=y;
	}
	
	ConstructureOverloading(int x, int y, double z){ //Fourth
		a=x;
		b=y;
		c=z;
	}
	
	ConstructureOverloading(int x, double y, int z){ //Fourth
		a=x;
		b=z;
		c=y;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		//ConstructureOverloading co = new ConstructureOverloading();
		//ConstructureOverloading co = new ConstructureOverloading(10, 20);
		//ConstructureOverloading co = new ConstructureOverloading(10, 20.5);
		//ConstructureOverloading co = new ConstructureOverloading(10, 20, 10.5);
		ConstructureOverloading co = new ConstructureOverloading(10, 20.5, 5);
		
		co.display();

	}

}
