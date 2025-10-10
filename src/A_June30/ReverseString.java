package A_June30;

public class ReverseString {

	
	public static void main(String [] args)
	{
		String s = "Hello Rahul, What are you doing?";
		String rev = "";
		
		//Way 1
	/*	for(int i=s.length()-1; i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
	*/
		//Way 2
		char[] a = s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev = rev + a[i];
		}
		System.out.println(rev);
		
	}
}
