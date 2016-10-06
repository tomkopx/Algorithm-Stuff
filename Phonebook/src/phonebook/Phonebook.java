package phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Phonebook {

	public static void main(String[] args) throws IOException {
		Hashtable<String, Object> phonebook = new Hashtable<String,Object>();
		String name;
		
		phonebook.put("Sarah", "123456789");
		phonebook.put("Valts", "123456788");
		phonebook.put("Steven", "123456787");
		phonebook.put("Conner", "123456786");
		phonebook.put("Ruairi", "123456785");
		phonebook.put("Ross", "123456784");
		phonebook.put("Jack", "123456783");
		phonebook.put("Beej", "123456782");
		phonebook.put("Adam", "123456781");
		phonebook.put("Matt", "123456780");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Enter friends name to get their number: ");
			name = br.readLine();
			
		}
		finally{
			br.close();
		}
		
		if(phonebook.containsKey(name)){
			System.out.println(name + "'s phone number is: " + phonebook.get(name));
		}
		else{
			System.out.println("This person is not in the hashtable!");
		}

	}

}
