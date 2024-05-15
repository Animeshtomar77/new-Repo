package javaCodingProjectsPractice1;

import java.util.Arrays;

public class SortingCharInString {

	public static void main(String[] args) {
		
		String s = "ibvaefhaofiofefoeb";
		
		char arr[] = s.toCharArray();
		
		Arrays.sort(arr);
		String sortedString = new String(arr);
		
		System.out.println(sortedString);
		
	}

}
