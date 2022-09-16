package Package;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Indonesia Raya", nstr="";
		
		char c;
		
		for (int i=0; i<str.length(); i++)
	      {
	        c= str.charAt(i);
	        nstr= c+nstr;
	      }
		
		System.out.println(nstr);
		
	}

}
