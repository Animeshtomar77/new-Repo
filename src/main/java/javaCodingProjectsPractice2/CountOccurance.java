package javaCodingProjectsPractice2;

import java.util.HashMap;


public class CountOccurance {
	
	

	    static void countChars(String string) {
	          HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
	          char[] charArray = string.toCharArray();
	          for (char c : charArray) {
	                if (charCount.containsKey(c)) {
	                      charCount.put(c, charCount.get(c) + 1);
	                } else {
	                      charCount.put(c, 1);
	                }
	          }
	          charCount.forEach((key, value) -> System.out.println("Character " + key + " occoured " + value));
	          
	    }
	    public static void main(String[] args) {
	          countChars("rajini");
	    }
	}


