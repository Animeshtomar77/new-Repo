package javaCodingProjectsPractice1;

public class ReveseString {
	
	
	static void reverseString() {
		
		
		String s= "animeshtomaracademy";
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev = rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		

	}

	public static void main(String[] args) {
		
			reverseString();
			
		}
		

}
