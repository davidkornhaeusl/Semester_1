package org.campus02.groﬂbuchstaben;

public class Groﬂ {
	
	private char[] wort;
	
	public Groﬂ(char[] wort)
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
