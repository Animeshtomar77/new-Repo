package javaCodingProjectsPractice1;

import java.util.HashMap;

public class CountStringCharacters {
	
	
	static void charcterCount(String input) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		char arr[] = input.toCharArray();
			
		for(int i=0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
				
			}
			else
			{
				hm.put(arr[i], 1);
			}
			
			}
		System.out.println(hm);
		}
	
	
	public static void main(String[] args) {
		charcterCount("animeshtomar");
		

	}

}
