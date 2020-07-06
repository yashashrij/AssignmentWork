package assignment;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;


public class Day3Ex5Qu10 {

	public static void main(String[] args) throws IOException  {

		
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\YashashriJadhav\\eclipse-workspace\\LMS Webdriver Assignment\\File.csv"));
		
		List<String[]> li=reader.readAll();
		System.out.println("Total rows which we have is "+li.size());
		
		Iterator<String[]>i1= li.iterator();
		
		while(i1.hasNext())
		{
			
			String[] str = i1.next();
			
			for(int i=0;i<str.length;i++)
			{
				System.out.println(" "+str[i]);
				
			}
			
			System.out.println("  ");
			
		}
	}

}
