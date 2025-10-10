package Interview_Programs;

public class ReverseWords {

	public static void main(String[] args) {
		String s = " Automation Testing";
		
		String rev = "";
		String word[] = s.split("\\s");
		for(int i=word.length-1; i>=0;i--)
		{
			rev = rev +word[i]+ " ";
		}
		System.out.println(rev);
	}

}
