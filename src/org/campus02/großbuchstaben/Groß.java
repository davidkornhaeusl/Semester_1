package org.campus02.gro�buchstaben;

public class Gro� {
	
	private char[] wort;
	
	public Gro�(char[] wort)
	{
		this.wort = wort;
	}
	
	public void convert()
	{
		String result = "";
		for(int i = 0; i < wort.length; i++)
		{
			char c = wort[i];
			
			if(i == 0 || wort[i-1] == ' ')
				c = Character.toUpperCase(c);
			result +=c;
		}
		
		System.out.println(result);
	}

}
