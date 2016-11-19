
public class Konto {
	
	private String kontoinhaber;
	private int kontostand;
	
	public String setInhaber(String kontoinhaber)
	{
		this.kontoinhaber = kontoinhaber;
		this.kontostand = 0;
		
		return this.kontoinhaber;
	}
	
	public int aufbuchen(int aufbuchen)
	{
		if(aufbuchen >= 0)
			this.kontostand += aufbuchen;
		else
			System.out.println("Kann keinen negativen Wert aufbuchen");
		return this.kontostand;
	}
	
	public boolean abbuchen(int abbuchen)
	{
		if(kontostand-abbuchen < 0)
		{
			System.out.println("Aheben von "+abbuchen+" ist nicht möglich");
			return false;
		}
			kontostand -= abbuchen;
			return true;
		
	}

}
