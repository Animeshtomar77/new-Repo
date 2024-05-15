package javaCodingProjectsPractice1;

import java.util.ArrayList;
//import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {

		// Approach 1
		// Using ArrayList
		
		int i1 = 0;
		int i2 = 1;
		ArrayList<Integer> myList = new ArrayList<Integer>();

		myList.add(i1);
		myList.add(i2);
		for (int i = 2; i < 10; i++) {
			myList.add(i, i1 + i2);
			i1 = i2;
			i2 = myList.get(i);
		}
		System.out.println(myList);  
		
		//Approach 2
		/*int fibLength;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		fibLength = sc.nextInt(); */
		
		/*int fibLength = 10;
		int[] num = new int[fibLength];
		
		num[0]= 0;
		num[1] = 1;
		
		for(int i=2; i<fibLength; i++)
		{
			num[i]= num[i-1]+num[i-2];
			
		}
		
		System.out.println( "Fibonacci series: ");
		
		 for(int i=0; i<fibLength; i++)
			{
			 	System.out.println(num[i]);
			
			}  */
		
	}

}
