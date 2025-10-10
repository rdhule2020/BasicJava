package Interview_Programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 101;
		int rev = 0;
		int a = num;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (a == rev) {
			System.out.println("palindrome number");
		} else {
			System.out.println("Not palindrome number");
		}
	}

}
