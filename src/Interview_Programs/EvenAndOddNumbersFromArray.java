package Interview_Programs;

public class EvenAndOddNumbersFromArray {

	public static void main(String[] args) {
		int ar[] = { 2, 4, 7, 55, 33, 9,17,39,23,79};
		
		int even =0;
		int odd = 0;
		for(int i=0; i<=ar.length-1;i++)
		{
			if(ar[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even digits : "+ even);
		System.out.println("Odd digits : "+ odd);
	}

}
