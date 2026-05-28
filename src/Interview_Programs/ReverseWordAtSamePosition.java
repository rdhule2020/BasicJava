package Interview_Programs;

public class ReverseWordAtSamePosition {

	public static void main(String[] args) {
		String input = "I am a Software Tester";
		String[] words = input.split(" ");
		StringBuilder output = new StringBuilder();

		for (String word : words) {

			// Reverse the word manually
			char[] ch = word.toCharArray();
			int left = 0, right = ch.length - 1;

			while (left < right) {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;

				left++;
				right--;
			}

			// Append reversed word
			output.append(new String(ch)).append(" ");
		}

		System.out.println("Output: " + output.toString().trim());
	}
}
