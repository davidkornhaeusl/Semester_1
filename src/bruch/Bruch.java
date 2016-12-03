package bruch;

public class Bruch {

	private int zaehler;
	private int nenner;
	
	public static int anzahlObjekte;
	
	public Bruch(int zaehler, int nenner)
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
		
		anzahlObjekte++;
	}
	
	public int getZaehler()
	{
		return zaehler;
	}

	public int getNenner()
	{
		return nenner;
	}
	
	public void print()
	{
		System.out.println(zaehler + " / " + nenner);
	}
	
	public double toDecimal()
	{
		return zaehler * 1.0 / nenner;
	}

	public Bruch multiplicate(Bruch b2)
	{
		int zaehler = this.zaehler * b2.getZaehler();
		int nenner = this.nenner * b2.getZaehler();
		
		return new Bruch(zaehler, nenner);
	}

	public Bruch multiplicate(Bruch b2, Bruch b3)
	{
		int zaehler = this.zaehler * b2.getZaehler() * b3.getZaehler();
		int nenner = this.nenner * b2.getZaehler() * b3.getZaehler();
		
		return new Bruch(zaehler, nenner);
	}
	
}
