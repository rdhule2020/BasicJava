package StringPrograms;

public class SumOfNumInString {
	
	public static void main(String []srge)
	{
		String str = "a2b3g2hs7j3k8l9";
		int sum=0;
		for(char ch : str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				sum = sum + Integer.parseInt(String.valueOf(ch));
			}
				
		}
		System.out.println(sum);
	}
}