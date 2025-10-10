package O_10cot;

public class a2b3c4d5 {

	
	public static void main(String[] args)
	{
		String input = "aabbbccccddddd";
		StringBuilder output = new StringBuilder();
		
		int count = 1;
		for(int i=0; i<=input.length()-1; i++) 
		{
			if(i+1<input.length() && input.charAt(i)==input.charAt(i+1))
			{
				count++;
			}else
			{
				output.append(input.charAt(i)).append(count);
				count=1;
			}
		}
		System.out.println("Output: " + output);
	}
}
