package B_11Sept;

public class Reverse_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rahul Dhule";
		String rev ="";
		for(int i = name.length()-1; i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
