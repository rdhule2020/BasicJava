package A_June30;

public class PalindromeString {

	public static void main(String [] args) {
	
	String s = "ABA";
	String rev = "";
	
	for(int i = s.length()-1; i>=0; i--)
	{
		rev = rev+ s.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equals(s))
	{
		System.out.println("It is palindrome string ");
	}else
	{
		System.out.println("It is not palindrome string");
	}
	
}}
