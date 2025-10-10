package Interview_Programs;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BOBt";

		String rev = "";

		for (int i = s.length()-1; i >=0; i--) 
		{
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Plaindrome string");
		}else
		{
			System.out.println("Not Plaindrome String");
		}
	}

}
