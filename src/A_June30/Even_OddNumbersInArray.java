package A_June30;

public class Even_OddNumbersInArray {

	public static void main(String [] args)
	{
		int a[]= {10, 23, 43, 25, 54, 34, 77,55,34};
		int count =0;
		
		for (int i=0; i<= a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i] + " is even number");
			}else
			{
				System.out.println(a[i] + " is odd number");
			}
			System.out.println("----------------------------------");
			if(a[i]==a[i])
			{
				count++;
			}
			System.out.println(count);
		}
	}
}
