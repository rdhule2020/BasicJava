package StringPrograms;

public class ExpandAString {
	public static void main(String []args)
	{
		String str = "a2b3c4d5";
		StringBuilder output = new StringBuilder();
		
		for(int i=0; i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				int count = Character.getNumericValue(str.charAt(i+1));
				
				for(int j=0; j<count;j++)
				{
					output.append(str.charAt(i));
				}
				i++;
			}
			
		}
		System.out.println(output.toString().trim());
	}
}
