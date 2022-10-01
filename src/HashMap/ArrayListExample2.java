package HashMap;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		System.out.println("Number elements in array list are: " + al.size());
		//adding elements to array list
		al.add("welcome");
		al.add(10);
		al.add(10.5);
		al.add('C');
		
		System.out.println("Number elements in array list are: " + al.size());
		System.out.println("elements in array list: " + al);
		
		//INSERTING ELEMENTS INTO ARRAY LIST
		al.add(2, "training"); //2 describes after number of elements not position
		al.add(4, 1234); //3 describes after number of elements not position
		System.out.println("Number elements in array list are: " + al.size());
		System.out.println("elements in array list: " + al);
		
		//Removing elements from array list
		al.remove("welcome"); //directly specify the value
		System.out.println("elements in array list: " + al); 
		
		al.remove(2); //2 discribes after number of elements of elements not position
		System.out.println("elements in array list: " + al); 
		

	}

}
