package Interview_Programs;

import java.util.Scanner;

public class LargestNumberUsingTernaryOperator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number :" );
		int a =  sc.nextInt(); 
		
		System.out.println("Enter Second Number :" );
		int b =  sc.nextInt();
		
		System.out.println("Enter Third Number :" );
		int c =  sc.nextInt();
		
		/*
		 * Way 1:
		int largest = a>b?a:b;
		int largest = c>largest?c:largest;
		*/
		
		//Way 2:
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println("Largest number :"+ largest);
	}

}
