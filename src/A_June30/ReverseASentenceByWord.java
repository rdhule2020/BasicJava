package A_June30;

public class ReverseASentenceByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Solve Java Interview Questions";
		
		String word[]= sentence.split("\\s");
		String rev="";
		
		for(int i=word.length-1; i>=0;i--)
		{
			rev = rev+ word[i]+" ";
		}
		System.out.println(rev);
	}

}
