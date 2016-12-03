package org.campus02.zinsen.biz;

public class Zinsberechnung {
	
	private double kapital;
	private double zinsen;
	
	public Zinsberechnung(double kapital)
	{
		this.kapital = kapital;
	}
	
	public double getZinsen()
	{
		return this.zinsen;
	}
	
	public void zinsberechnung(int tage, double zinssatz)
	{
		this.zinsen = kapital*tage/36000*zinssatz;
	}

}
