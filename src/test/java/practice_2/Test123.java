package practice_2;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test123 {

	public static void main(String[] args) {
		
		String str = "i am learning java java java";
		
	char arr[]	=str.toCharArray();
	
	HashMap<Character, Integer> hm = new HashMap<>();
	
	
	for (char k: arr) {
		
		if(hm.containsKey(k)) {
			hm.put(k, hm.get(k)+1);
		}
		
		else {
			hm.put(k, 1);
		}
		
	}
	System.out.println(hm);
	
	
	//HashSet<Character> hs = new HashSet<>();
	
	
	

}
}