/*Exception is an event which will terminate program unexpectedly
 * Type of exceptions:
 * - Checked exceptions: exceptions which are identified by the java compiler
 * 		Ex: IOException, FileNotFoundException, etc...
 * 
 * - Unchecked exceptions: exceptions which are not identified by the java compiler
 * 		Ex: ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutofBoundException etc..
 * */
package ExceptionHandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		System.out.println("Started");
		
		//Thread.sleep(4000); //InterruptedException - Checked Exception
		
		
		int i=10;
		System.out.println(i/0); //ArithmeticException - Unchecked Exception
		
		System.out.println("Stopped");

	}

}
