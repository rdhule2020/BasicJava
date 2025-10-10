package B_12Sept;

public class HalfString {

	public static void main(String [] srgs) {
	String s = "Testing Java";
	String a = s.replace("Testing", " ");
	
	for(int i = s.length()-5;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	System.out.println(a);
	
	
}
}