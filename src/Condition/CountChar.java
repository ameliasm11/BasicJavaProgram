package Condition;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "Quality Assurance Engineer";
		int count = 0;
		
		//Count
		for(int i=0; i < words.length(); i++) {
			if(words.charAt(i) != ' ')
			count++;
		}
		
		//display output
		System.out.println("Total character = "+count);
	}

}
