
public class Konto {
	
	private String kontoinhaber;
	private int kontostand;
	
	public Konto(String kontoinhaber)
	{
		this.kontoinhaber = kontoinhaber;
		this.kontostand = 75;
	}
	
	public boolean aufbuchen(int aufbuchen)
	{
		if(!validate(0, aufbuchen))
		{
			return false;
		}
		
			this.kontostand += aufbuchen;
			
		return true;
	}
	
	public boolean abbuchen(int abbuchen)
	{
		if(!validate(abbuchen, 0))
		{	
			return false;
		}
		
			kontostand -= abbuchen;
			return true;
		
	}
	
	public boolean validate(int abbuchen, int aufbuchen)
	{
		if(kontoinhaber == null || kontoinhaber.isEmpty())
		{	
			System.out.println("Keine Kontoinhaber gesetzt");
			return false;
		}
		
		if(kontostand-abbuchen < 0)
		{
			System.out.println("Aheben von "+abbuchen+" ist nicht möglich");
			return false;
		}
		
		if(aufbuchen < 0)
		{
			System.out.println("Kann keinen negativen Wert aufbuchen");
			return false;
		}
		return true;
	}
	
	public void print()
	{
		System.out.println("Inhaber: "+kontoinhaber+"\nKontostand: "+kontostand);
	}

}
