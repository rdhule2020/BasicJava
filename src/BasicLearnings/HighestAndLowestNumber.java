package BasicLearnings;

import java.util.Arrays;

public class HighestAndLowestNumber {

	public static void main(String[] args) {

		int[] num = {-6, 23, 43, 5, 9, 11, 29, 2};
		Arrays.sort(num);
		System.out.println("Lowest number : " + num[0]);
		System.out.println("Highest number: " + num[num.length-1]);
		}
	}


