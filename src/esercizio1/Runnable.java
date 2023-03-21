package esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Runnable {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("Insert the number of words you want to provide: ");
		int numOfWords = scanner.nextInt();
		scanner.nextLine();
		
		Set<String> setWords = new HashSet<String>();
		List<String> setDuplicates = new ArrayList<String>();
		
		int cycles = 0;
		for (int i = 0; i < numOfWords; i++) {
			System.out.println("Insert a word to add: ");
			String newWord = scanner.nextLine();
			
			boolean added = setWords.add(newWord);
			
			if (added != true) {
				setDuplicates.add(newWord);
			}
			cycles++;
		}
		
		if (cycles == numOfWords) {
			
			System.out.println("\nDuplicate words are: ");
			for (String elem : setDuplicates) {
				System.out.println(elem);
			}
			System.out.println("\nTotal unique words: " + setWords.size());
			System.out.println("Unique words are: ");
			for (String elem : setWords) {
				System.out.println(elem);
			}

		}
	}
}
