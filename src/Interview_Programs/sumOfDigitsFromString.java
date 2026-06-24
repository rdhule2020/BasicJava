
package Interview_Programs;

import java.util.Scanner;

public class sumOfDigitsFromString {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.next();// a2b3n4c5
		int sum = 0;
		System.out.println(sum);
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				sum = sum + ch -'0';
			 // sum += Integer.parseInt(String.valueOf(ch)); 
			}
		}
		
		System.out.println("Sum of Digits :"+sum);
		sc.close();
	}
}