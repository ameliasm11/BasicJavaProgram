package HashMap;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<String>();
		
		//add elements to array list
		
		list.add("Amel");
		list.add("Amel1");
		list.add("Amel2");
		list.add("Amel3");
		list.add("Amel4");
		
		
		System.out.println(list.size()); //return number of elements in array list
		
		for(String s:list) { //reading elements from array list
			System.out.println(s);
		}
	}

}
