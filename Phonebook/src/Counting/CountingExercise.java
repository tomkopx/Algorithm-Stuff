package Counting;

import java.io.*;
import java.util.*;

public class CountingExercise {

	public static void main(String[] args) {
		if (args.length < 0)
        {
            System.out.println("USAGE: java CountWordsFile <filename>");
        }
        else
        {
        	
        	HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
            String delim = " \t\n.,:;?!-/()[]\"\'";
            String filename = "E:/Algorithm Stuff/Phonebook/counting.txt";
            String line = null;
            int count = 0;
            int diffWord = 0;
            try
            {
                FileReader fR = new FileReader(filename);
                BufferedReader bR = new BufferedReader(fR);

                while((line = bR.readLine()) != null)
                {
                    StringTokenizer strTok = new StringTokenizer(line,delim);
                    String tmpStr = null;
                    while(strTok.hasMoreTokens())
                    {
                        count++;
                        tmpStr = strTok.nextToken();
                        System.out.println(tmpStr);
                        if(wordCount.containsKey(tmpStr)){
                        	int temp = wordCount.get(tmpStr).intValue();
                        	wordCount.put(tmpStr, new Integer(temp + 1));
                        }
                        else{
                        	wordCount.put(tmpStr, new Integer(1));
                        	diffWord += 1;
                        }
                    }
                }
                System.out.println("Total number of words: "+count);
                System.out.println("Total number of different words: "+ diffWord);
                
                for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
                	System.out.println(entry.getKey() + " = " + entry.getValue());
                }
            }
            catch(FileNotFoundException ex){ System.out.println("File Not Found"); }
            catch(IOException ex){ System.out.println("An IOException :D"); }
        }

	}

}
