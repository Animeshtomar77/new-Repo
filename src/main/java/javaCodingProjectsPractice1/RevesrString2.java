package javaCodingProjectsPractice1;

public class RevesrString2 {

		static void reversestr() {
			
			String s= "animeshtomaracademy";
			String rev= "";
			
		char[] chrarr= s.toCharArray();
		
			for(int i=chrarr.length-1; i>=0; i-- )
			{
				rev = rev+chrarr[i];
				
			}
		System.out.println(rev);
			
		}
		
	public static void main(String[] args) {
		
		reversestr();
		
	}

}
