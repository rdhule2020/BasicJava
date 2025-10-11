package Interview_Programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153;
		int org_num= num;
		int sum = 0;
		while(num>0)
		{
			int digit = num%10;
			sum = sum + (digit * digit * digit);
			num = num/10;
		}
		if(sum == org_num)
		{
			System.out.println("it is Armstrong number");
		}else
		{
			System.out.println("It is not armstrong number");
		}
	}

}
