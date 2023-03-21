package esercizio3;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIM mySIM = new SIM (1234567890);
		mySIM.addContact("Shibe", 1234567890);
		mySIM.addContact("Wow", 1987654321);
		mySIM.addContact("Doge", 156789876);
		mySIM.addContact("Very wow", 1987654321);
		System.out.println("Your initial contacts:");
		mySIM.printAllContacts();
		
		mySIM.removeContact("Very wow");
		System.out.println("\nYour updated contacts:");
		mySIM.printAllContacts();
		
		System.out.println("\nSearching for Shibe's number:");
		mySIM.findPerson("Shibe");
		
//		System.out.println("\nSearching for number 1987654321:");
//		mySIM.findNumber(1987654321);
	}

}
