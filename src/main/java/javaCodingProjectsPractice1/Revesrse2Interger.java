package javaCodingProjectsPractice1;

public class Revesrse2Interger {

	public static void main(String[] args) {
		
		int i1= 10;
		int i2= 20;
		
		
		//approach 1 without using any 3rd variable
		
		i1 = i1+i2;
		i2 = i1-i2;
		i1 = i1-i2;
		System.out.println("i1---> "+ i1);
		System.out.println("i2---> "+ i2);
	}

}
