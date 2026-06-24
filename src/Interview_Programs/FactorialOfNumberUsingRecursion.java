package Interview_Programs;

import java.util.Scanner;

public class FactorialOfNumberUsingRecursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int result;
		
		if(n==1)
		{
			result = 1;
		}else
		{
			result = n * (n-1);
		}

		System.out.println(result);
		scanner.close();
	}

}
