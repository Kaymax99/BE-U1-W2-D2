package esercizio3;

import java.util.HashMap;
import java.util.Map;


public class SIM {
	
	int phoneNum;
	static Map<String, Integer> ListaContatti = new HashMap<String, Integer>();
	
	public SIM(int number) {
		this.phoneNum = number;
	}
	
	public void addContact(String name, int number) {
		if(!ListaContatti.containsKey(name)) {
			ListaContatti.put(name, number);
		}
	}
	
	public void removeContact(String name) {
		if(ListaContatti.containsKey(name)) {
			ListaContatti.remove(name);
		}
	}
	
	public void findPerson(String name) {
		if (ListaContatti.get(name) == null) {
			System.out.println("No contact found with name: " + name);			
		} else {
			System.out.println(ListaContatti.get(name));
		}
	}
	
	public void findNumber(int number) {
		ListaContatti.entrySet().forEach(entry -> {
			if (entry.getValue() == number)
		    System.out.println("The number " + number + " belongs to: " + entry.getKey());
		});
	}
	
	public void printAllContacts() {
			ListaContatti.entrySet().forEach(entry -> {
			    System.out.println(entry.getKey() + ": " + entry.getValue());
			});

	}

}
