package Interview_Programs;

public class ReverseArray {

	public static void main(String[] args) {
		int ar[] = { 1,5,3,7,4,5};
		
		System.out.println("Reverse order of Array :");
		
		for(int i= ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+ " ");
		}

	}

}
