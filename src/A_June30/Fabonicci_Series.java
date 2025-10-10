package A_June30;

public class Fabonicci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=0;
			int b=1;
			int c;
			
			for(int i=0; i<=20;i++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
			}
	}

}
