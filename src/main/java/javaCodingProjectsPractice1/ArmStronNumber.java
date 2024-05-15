package javaCodingProjectsPractice1;

public class ArmStronNumber {

	public static void main(String[] args) {
		
		int num = 371;
		int actulnum = num;
		int sum = 0;
		int digits[] = new int[Integer.toString(num).length()];
		
		int i=0;
		while(num>0)
		{
			digits[i]=num%10;  //extract last digit
			sum = sum+ digits[i]*digits[i]*digits[i];
			num= num/10;
			i++;
		}
		
		if(sum==actulnum)
			{
				System.out.println("number is armstrong no: "+ "num is "+actulnum + " sum is "+sum);
				
			}
			else
			{
				System.out.println("number is not armstrong no: "+ "num is "+actulnum + " sum is "+sum);
			}
		

	}

}
