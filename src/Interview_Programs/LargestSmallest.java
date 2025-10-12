package Interview_Programs;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int ar[]= {2,75,776,23,54,224,3};
		
		int largest=ar[0];
		int smallest=ar[0];
		
		for(int a : ar)
		{
			if(a>largest)
			{
				largest=a;
			}
			if(a<smallest)
			{
				smallest=a;
			}
			
		}
		System.out.println("smallest :" + smallest);
		System.out.println("Largest :"+ largest);
	}

}
