package O_10cot;

public class ReverseLetters {

	public static void main(String[] args) {
		String n = "Automation using java & selenium";
		
		String rev ="";
		
		for(int i= n.length()-1;i>=0;i--)
		{
			rev = rev + n.charAt(i);
		}
		System.out.println(rev);
	}

}
