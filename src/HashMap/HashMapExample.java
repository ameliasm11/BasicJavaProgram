package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//adding keypairs (entry set) to hash map
		hm.put(100, "amel");
		hm.put(102, "hi");
		hm.put(103, "hello");
		
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet()) {
			
			System.out.println(m.getKey()+ " " +m.getValue());
			
			hm.remove(103);
			System.out.println(hm);
		}

	}

}
