package B_11Sept;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 101;
		int Orgnum=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(rev==Orgnum)
		{
			System.out.println("it is Palindrome number");
		}
		else
		{
			System.out.println("It is not Palindrome number");
		}
	}

}
