package javaCodingProjectsPractice1;

public class SwapString1 {
	
	static void swapStr() {
		

		String s1= "animesh";
		String s2= "tomar";
		
		 s1 = s1+s2;   // s1= animeshtomar
		
		 s2 = s1.substring(0, s1.length()-s2.length());
		 s1 = s1.substring(s2.length());
		 
		 System.out.println(s1);
		 System.out.println(s2);
		
		
	}
	
	

	public static void main(String[] args) {
		swapStr();
		
	}

}
