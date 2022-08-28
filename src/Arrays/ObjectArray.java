package Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
//		Object a[]=new Object[5];
//		
//		a[0]=10;
//		a[1]=20.5;
//		a[2]="welcome";
//		a[3]='G';
//		a[4]=true;
		
		Object a[]= {100,200.567,"Welcome",'X',true,200,30.9}; 
		
		for(Object i:a) {
			System.out.println(i);
		}

	}

}
