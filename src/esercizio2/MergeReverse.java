package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeReverse {
	
	static List<Integer> mergedList = new ArrayList<Integer>();
	
	public static List<Integer> ReverseAndMerge(List<Integer> list1) {
		
		addToArray(list1);
		Collections.reverse(list1);
		addToArray(list1);
		
		return mergedList;
	}
	
	private static void addToArray(List<Integer> list) {
		for (Integer elem : list) {
			mergedList.add(elem);
		}
	}
	
}
