package B_11Sept;

public class ReverseWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String sentence = "I love My World";
			String Rev = "";
					
			String word[]= sentence.split("\\s");
			for(int i=word.length-1;i>=0;i-- )
			{
				Rev = Rev+word[i]+ " ";
			}
			System.out.println(Rev);
	}

}
