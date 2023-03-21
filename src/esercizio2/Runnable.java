package esercizio2;

import java.util.List;
import java.util.Scanner;

public class Runnable {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<Integer> randList = RandomList.createRanList();
		System.out.println("Here's your list:");
		System.out.println(randList);
		
		List<Integer> mergedList =  MergeReverse.ReverseAndMerge(randList);
		System.out.println("\nHere's your modified list:");
		System.out.println(mergedList);
		
		System.out.println("How do you want your list to be printed? (true prints elements in even positions, false prints odd positions): ");
		boolean value = scanner.nextBoolean();
		
		if (value == true) {
			for (int i = 0; i < mergedList.size(); i = i+2) {
				System.out.println(mergedList.get(i)); 
			}
		}
		else {
			for (int i = 1; i < mergedList.size(); i = i+2) {
				System.out.println(mergedList.get(i)); 
			}
		}
	}
}
