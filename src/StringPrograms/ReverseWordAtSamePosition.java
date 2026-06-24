package StringPrograms;

public class ReverseWordAtSamePosition {
	public static void main(String[] args) {
		String input = " Hay, Are you looking for a Job Change";
		String [] words = input.split(" ");
		StringBuilder output = new StringBuilder();
		for(String word : words)
		{
			// Reverse the word manually
			char ch[] = word.toCharArray();
			
			int left=0;
			int right = ch.length-1;
			while(left<right)
			{
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right]= temp;
				
				left++;
				right--;
			}
			// Append reversed word
			output.append(new String(ch)).append(" ");
		}
		System.out.println("Reverse of Words in Sentence at Same Position :"+ output.toString());
	}
}
