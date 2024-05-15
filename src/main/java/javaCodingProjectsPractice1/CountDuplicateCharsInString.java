package javaCodingProjectsPractice1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountDuplicateCharsInString {

		public static void countduplicatechars(String input) {
			
			HashMap <Character, Integer> hm= new HashMap<>();
			
			char [] arr = input.toCharArray();
			for(char ch : arr) {
				if(hm.containsKey(ch)) {
					hm.put(ch, hm.get(ch)+1);
				}
				else {
					hm.put(ch, 1);
				}
				
			}
		/*Set <Character> keys = new HashSet<>(hm.keySet());
		
		for( char key:keys) {
			if(hm.get(key)>1) {
				System.out.println(key +"--->"+ hm.get(key));
			}
			
		}*/
			System.out.println(hm);
			
		}
public static void main(String args[]) {
	countduplicatechars("aabbcceeddggggggggg");
	
}



}
