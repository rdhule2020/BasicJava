 package Interview_Programs;

public class CountOccurrencesOfCharacters {
	
	
	//Method 1 : Using Array concept
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "Automation Testing Interview Questions";
//		
//		int count = 0;
//		
//		char[] ar = s.toCharArray();
//		for(int i =0; i<=ar.length-1;i++)
//		{
//			count++;
//		}
//		System.out.println(count);
//	}

	//Method 1 : Using String concept
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Automation Testing Interview Questions";
		
		int count = 0;
		
		
		for(int i =0; i<=s.length()-1;i++)
		{
			count++;
		}
		System.out.println(count);
		
		
	}
}
