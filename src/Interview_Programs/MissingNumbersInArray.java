package Interview_Programs;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {10, 2, 4, 6, 7, 3, 8};
		
		int n=11;
		boolean[] present = new boolean[n+1];
		for(int num : ar)
		{
			present[num]= true;
		}
		System.out.println("Missing numbers: ");
		for(int i=1; i<=n; i++)
		{
			if(!present[i])
				System.out.println(i + " ");
		}
	}

}
