package Interview_Programs;

public class DuplicatesInArray {

	public static void main(String[] args) {
 
		int ar[] = { 12, 24, 54, 23, 12, 34, 23, 23 };

		System.out.println(" Duplicate elements :");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[i]);
				}
			}
		}

	}

}
