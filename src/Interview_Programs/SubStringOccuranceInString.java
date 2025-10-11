package Interview_Programs;

public class SubStringOccuranceInString {

	public static void main(String[] args) {
		
		String a = "Automation";
		String b ="at";
		
		int count=0;
		int index=0;
		while((index=a.indexOf(b,index))!=-1)
		{
			count++;
			index++;
		}
		System.out.println("Substring '" + b + "' occurs " + count + " times in the string.");
	}

}
