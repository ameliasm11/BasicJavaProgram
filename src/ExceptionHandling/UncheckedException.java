package ExceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		int a=10;
		
	//	System.out.println(a/0); //Arithmetic Exception
		String s = null;
		
		//System.out.println(s.length()); //NullPointerException
		
		String st = "abc" ;
		
		//convert string to integer
		//int i = Integer.parseInt(st); //NumberFormatException
		//System.out.println(i);
		
		int arr[]=new int[5];
		arr[10]=100; //ArrayIndexOutOfBoundsException
		
		

	}

}
