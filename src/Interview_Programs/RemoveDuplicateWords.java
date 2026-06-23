package Interview_Programs;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String str = "Check the list of the words in array and remove duplicate words from the list";

		String[] words = str.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (words[i].equals(words[j])) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				result = result + words[i] + " ";
			}
		}
		System.out.println("Original String :" + str);
		System.out.println("Final String : " + result.trim());
	}

}
