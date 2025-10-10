package O_10cot;

import java.util.Arrays;

public class AnagramString {

	
	public static void main(String [] args)
	{
		String s1 = "listen";
		String s2 = "Silent";
		
		//Split
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		//convert to char array
		char ar1[] = s1.toCharArray();
		char ar2[] = s2.toCharArray();
		
		//sort Arrays
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		//assertion
		if(Arrays.equals(ar1, ar2))
		{
			System.out.println("It is anagram string");
		}
		else
		{
			System.out.println("It is not anagram string");
		}
				
	}
}
