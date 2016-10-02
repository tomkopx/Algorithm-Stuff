package ArrayListsStuff;
import java.util.*;

public class Hello {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		
		//al.remove(0);
		//al.remove(4);
		//Collections.sort(al);
		//Collections.reverse(al);
		//Collections.rotate(al, 1);
		//Collections.rotate(al, -1);
		//Collections.swap(al, 0, 4);
		//al.set(0, "Une");
		al.add(0, "Zero");
		
		System.out.println(al);

	}

}