package O_10cot;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "My name is Rahul";
		String rev = "";
		String word[]= name.split("\\s");
		
		for(int i = word.length-1; i>=0; i--)
		{
			rev = rev + word[i]+ " ";
		}
		System.out.println(rev);
	}

}
