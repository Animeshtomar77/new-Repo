package javaCodingProjectsPractice1;

public class CountCpaitalLettersInString {
	
	
	public static void countCapitalLetters() {
		String s = "AnimeshTomarAcademY";
		int count = 0;
		
		char arr[] = s.toCharArray();
		
		for(int i =0; i<s.length(); i++) {
			if(arr[i]>= 'A'&& arr[i]<='Z') {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		countCapitalLetters();

	}

}
