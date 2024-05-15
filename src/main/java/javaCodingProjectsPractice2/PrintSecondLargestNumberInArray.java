package javaCodingProjectsPractice2;

public class PrintSecondLargestNumberInArray {

	public static void printSecondLargest() {
		
		int arr[] = {60, 50, 60, 80, 10, 70};
		int max = 0;
		int secondMax = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secondMax = max;
				max= arr[i];
			}
			else if(arr[i]> secondMax && arr[i]!= max) {
				secondMax= arr[i];
			}
			
		}
		
		System.out.println(max);
		System.out.println(secondMax);
	}
	
	
	public static void main(String[] args) {
		printSecondLargest();

	}

}
