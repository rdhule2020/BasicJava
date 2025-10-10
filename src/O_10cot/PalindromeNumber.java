package O_10cot;

public class PalindromeNumber {
	
	public static void main(String [] args)
	{
		 int num = 101;
		 int org_num = num;
		 int rev=0;
		 
		 while(num!=0)
		 {
			 rev=rev*10 + num%10;
			 num=num/10;
		 }
		 
		 if(rev==org_num)
		 {
			 System.out.println("It is P number");
		 }
		 else {
			 System.out.println("it is not p number");
		 }
	}
}
