package javaCodingProjectsPractice2;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		
		int num = 12322;
		int rev = 0;
		int orignal = num;
		while(num!=0) {
			int reminder = num%10;
			rev = rev*10 +reminder;
			num = num/10;
			
		}
		System.out.println(rev);
		if(orignal==rev) {
		System.out.println("Number is palindrome "+ orignal);}
		
		else {
			System.out.println("Number is not palindrome "+ orignal);
		}
	}

}
