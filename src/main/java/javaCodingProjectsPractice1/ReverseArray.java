package javaCodingProjectsPractice1;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
	
		int reverse[]= new int[arr.length];
		int k=0;
		for(int i=arr.length-1; i>=0; i--){
			
			reverse[k]= arr[i];
			System.out.println(reverse[k]);
			k++;
			
			
		}
		
	}

}
