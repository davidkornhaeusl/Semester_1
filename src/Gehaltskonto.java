
public class Gehaltskonto {

	private String inhaber, IBAN, BIC;
	private double kontostand;
	
	public Gehaltskonto(String inhaber, String IBAN, String BIC)
	{
		this.inhaber = inhaber;
		this.IBAN = IBAN;
		this.BIC = BIC;
		this.kontostand = 0.0;
	}
	
	public String getInhaber(String inhaber)
	{
		return this.inhaber=inhaber;
	}
	
	public String getIBAN(String IBAN)
	{
		return this.IBAN= IBAN;
	}
	
	public String getBIC(String BIC)
	{
		return this.BIC=BIC;
	}
	
	public double aufbuchen(double wert)
	{
		this.kontostand += wert;
		return this.kontostand;
	}

	public double abbuchen(double wert)
	{
		if(this.kontostand-wert > 0)
			this.kontostand -= wert;
		return this.kontostand;
	}
	
	public double getKontostand()
	{
		return this.kontostand;
	}
	
}
