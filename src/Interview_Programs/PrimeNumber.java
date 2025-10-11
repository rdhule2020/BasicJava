package Interview_Programs;

public class PrimeNumber {

	public static void main(String [] args)
	{
		int num = 29;
		
		if(num<=1)
		{
			
			System.out.println("It is not prime number");
			return;
		}
		boolean isPrime = true;
		for(int i=2; i<=Math.sqrt(num); i++)
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("It is prime number");
		}else
		{
			System.out.println("It is not prime number");
		}
	}
}
