package Arrays;

import java.util.Arrays;

public class SameValue {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 200, 50, 10};
	    int[] arr2 = {30, 0, 6, 3, 6, 4, 70, 200};
	 
	    System.out.println("Array 1 : "+Arrays.toString(arr1));
	    System.out.println("Array 2 : "+Arrays.toString(arr2));
	 
	        for (int i = 0; i < arr1.length; i++)
	        {
	            for (int j = 0; j < arr2.length; j++)
	            {
	                if(arr1[i] == (arr2[j]))
	                {
	                 System.out.println("Same value is: "+(arr1[i]));
	                }
	            }
	        }
	        
	}
}
