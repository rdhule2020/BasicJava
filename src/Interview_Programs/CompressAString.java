package Interview_Programs;

public class CompressAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcccddddeeeeeffffffggggggg";		
		StringBuilder output = new StringBuilder();
		int count =1;
		for(int i=0; i<=s.length()-1; i++)
		{
			if(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				output.append(s.charAt(i)).append(count);
				count=1;
			}
		}
		System.out.println(output);
	}

}
