package javaCodingProjectsPractice1;

public class SumOfDigits {

	public static void main(String[] args) {

		int i = 43599;
		int sum = 0;
//Approach 1
		/*
		while (i > 0) {
			sum = sum + i % 10;
			i = i / 10;
		}  */
		
	char arr[]	= Integer.toString(i).toCharArray();
		
		for(int k=0; k<arr.length; k++)
		{
			sum = sum + Character.getNumericValue(arr[k]);
			
		}
	System.out.println(sum);

	}

}
