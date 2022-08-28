package Loops;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue; //whenever i become 5 it will continue, so 5 will not be printed
			}
			System.out.println(i);
		}

	}

}
