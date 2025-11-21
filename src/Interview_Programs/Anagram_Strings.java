 package Interview_Programs;

import java.util.Arrays;

public class Anagram_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " Silent";
		String s2 = "lisTen";
		
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ar1 = s1.toCharArray();
		char[] ar2 = s2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1,ar2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
	}

}
