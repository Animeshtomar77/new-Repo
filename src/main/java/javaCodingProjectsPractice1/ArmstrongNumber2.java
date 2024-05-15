package javaCodingProjectsPractice1;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		
		int num = 372;
		
		int actaulnum= num;
		
		double sum = 0;
		
		while(num!=0)
		{
			int n = num%10;
			sum = sum+ Math.pow(n, 3);
			num = num/10;
			
		}
		
		if(sum==actaulnum)
		{
			System.out.println("number is armstrong no: "+ "num is "+actaulnum + " sum is "+sum);
			
		}
		else
		{
			System.out.println("number is not armstrong no: "+ "num is "+actaulnum + " sum is "+sum);
		}
	
		

	}

}
