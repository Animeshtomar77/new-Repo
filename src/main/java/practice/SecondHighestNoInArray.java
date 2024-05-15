package practice;

public class SecondHighestNoInArray {

	public static void main(String[] args) {
		
		int arr[] =  {70 , 60 , 30 , 40, 10};
		
		int max = 0;
		int secMax = 0;
		
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]> max)
			{
				secMax = max;
				
				max = arr[i];
				
			}
		
			else if(arr[i] > secMax && arr[i]!= max)
			{
				secMax = arr[i];
			}
			
		}
		
		System.out.println(secMax);
		System.out.println(max);

	}
}