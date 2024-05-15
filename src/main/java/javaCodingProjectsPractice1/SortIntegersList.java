package javaCodingProjectsPractice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegersList {

	public static void main(String[] args) {
		
		List<Integer> mylist = new ArrayList<>();
		
		mylist.add(20);
		mylist.add(40);
		mylist.add(10);
		mylist.add(5);
		mylist.add(81);
		mylist.add(23);
		mylist.add(19);
		
		Collections.sort(mylist, Collections.reverseOrder());
		System.out.println(mylist);
		
		

	}

}
