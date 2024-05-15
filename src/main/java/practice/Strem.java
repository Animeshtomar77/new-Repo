package practice;

import java.util.ArrayList;

public class Strem {

	public static void main(String[] args) {
		
		
			ArrayList<String> names= new ArrayList<String>();
			
			names.add("Animesh");
			names.add("Sunita");
			names.add("Abhishek");
			names.add("Tiwari");
			names.add("Aditya");
			names.add("Sharma");
			
		long count=names.stream().filter(s-> s.startsWith("A")).count();
		System.out.println(count);
		
	}

}
