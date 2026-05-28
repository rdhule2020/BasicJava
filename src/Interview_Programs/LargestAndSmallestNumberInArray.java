package Interview_Programs;

import java.util.Arrays;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 23, 34, 1, 54, 14, 34, 2, 37, 76, 4 };

		Arrays.sort(a);
		int Smallest_number = a[0];
		int SecondSmallest_number = a[0 + 1];
		int Largest_number = a[a.length - 1];
		int SecondLargest_number = a[a.length - 2];
		System.out.println(Smallest_number);
		System.out.println(Largest_number);
		System.out.println(SecondLargest_number);
		System.out.println(SecondSmallest_number);
	}
}
