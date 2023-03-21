package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
	
	public static List<Integer> createRanList() {
		System.out.println("Insert the amount of numbers you want the list to be populated with: ");
		int numOfElems = Runnable.scanner.nextInt();
		Runnable.scanner.nextLine();
		
		List<Integer> randomList = new ArrayList<Integer>();
		
		for (int i = 0; i < numOfElems; i++) {
			randomList.add(randomNum());
		}
		
		return randomList;
	}
	
	
	private static int randomNum() {
		Random rand = new Random();
		int num = rand.nextInt((100 - 0));
		return num;
	}
}

