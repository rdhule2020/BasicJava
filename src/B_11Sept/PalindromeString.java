package B_11Sept;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "TataT";
		String rev ="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(rev.equals(name))
		{
			System.out.println("It is palindrome String");
		}
		else
		{
			System.out.println("It is not palindrome String");
		}
	}

}
