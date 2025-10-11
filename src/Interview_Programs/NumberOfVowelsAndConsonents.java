package Interview_Programs;

public class NumberOfVowelsAndConsonents {

	public static void main(String[] args) {
		
		String s = "Automation";
		int consonents = 0;
		int vowels= 0;
		for(int i=0; i<=s.length()-1; i++)
		{
			s= s.toLowerCase();
			if(s.charAt(i) == 'a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u')
			{
				vowels++;
			}
			else
			{
				consonents++;
			} 
			
		}
		System.out.println("vowels :" + vowels);
		System.out.println("consonents:" + consonents);
	}

}
