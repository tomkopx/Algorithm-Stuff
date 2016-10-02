package ArrayListsStuff;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStudents {

	public static void main(String[] args) throws Exception {
		
		//You can make it more flexible by using current directory
		FileReader fr = new FileReader("E:/Algorithm stuff/ArrayLists/SortFiles/students.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<String>();
		String l;
		
		//Try..finally brackets to safely close the buffered reader
		try {
			while((l = br.readLine())!= null){
				al.add(l);
			}
		}
		finally {
			br.close();
		}
		
		Collections.sort(al);
		
		/* Splitting solution
		for(String s : al) {
			
			String [] split = s.split(", ");
			System.out.println(split[0]);
		}
		*/
		
		//System.out.println(al.size());
		
		/* Print only names starting with M
		for(String s : al) {
			if(s.startsWith("M")){
				System.out.println(s);
			}
		}
		*/
		
		/* Prints longest name
		String max = Collections.max(al, Comparator.comparing(s -> s.length()));
		System.out.println(max);
		*/
		
		/* Prints all the Smiths
		for(String s : al) {
			if(s.contains("Smith")){
				System.out.println(s);
			}
		}
		*/
		

		for(String s : al) {
			
			String [] split = s.split(", ");
			if(split[0].charAt(0) == split[1].charAt(0)){
				System.out.println(s);
			}
		}

	}

}