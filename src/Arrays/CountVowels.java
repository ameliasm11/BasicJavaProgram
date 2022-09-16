package Arrays;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = new String("Indonesia Raya");
		
		//Count
		for(int i=0; i < words.length(); i++) {
			if(words.charAt(i) == 'a' || 
					words.charAt(i) == 'i' ||
					words.charAt(i) == 'u' ||
					words.charAt(i) == 'e' ||
					words.charAt(i) == 'o')
			//display output
			System.out.println("Huruf vocal = "+ words.charAt(i));
		}
		

	}

}
