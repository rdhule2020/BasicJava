package O_10cot;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "text";
		String rev="";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("It is p String");
		}else
		{
			System.out.println("It is not p String");
		}
	}

}
