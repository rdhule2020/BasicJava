package A_June30;

public class Palindrome_number {

	public static void main(String [] args) {
		
		int num = 101;
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num=num/10;
		
		}
		System.out.println(rev);
		if(org_num==rev)
		{
			System.out.println("it is palinndrome number");
		}
		else
		{
			System.out.println("it is not palindrome number");
		}
		
	}
}
