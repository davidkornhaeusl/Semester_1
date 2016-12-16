package org.campus02.csvteilen;

import java.util.Arrays;

public class CSVParser {
	
	private String csvline;
	
	public CSVParser (String csvline)
	{
			this.csvline = csvline;
	}
	
	public int countComma()
	{
		int anzahl = 0;
		
		for(int i = 0; i < csvline.length(); i++)
		{
			if(csvline.charAt(i) == ',')
			{
				anzahl++;
			}
		}
	
		return anzahl;
	}
	
	public String[] parse()
	{
		String[] inArray = new String[countComma()+1];
		String teile = "";
		int j = 0;
		
		for(int i = 0; i < inArray.length; i++)
		{
			if(i!=0)
				j++;
				teile = "";
			while(j < csvline.length())
			{
				if(csvline.charAt(j) != ',')
				{
					teile += csvline.charAt(j);
					j++;
				}
			}
			
			inArray[i] = teile;
			System.out.println(inArray[i]);
		}
		return inArray;
	}
	
	public void print()
	{
		System.out.println(Arrays.toString(parse()));
	}
	
	

}
