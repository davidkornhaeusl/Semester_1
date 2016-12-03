package org.campus02.generics;

import java.util.GregorianCalendar;

public class Profil {
	
	private String vorname;
	private String nachname;
	private MayBe<String> bezStatus;
	private MayBe<Integer> alter;
	private MayBe<Double> gehalt;
	private MayBe<String> password;
	private MayBe<GregorianCalendar> gebDatum;
	
	public Profil(String vorname, String nachname, MayBe<Integer> alter, 
			MayBe<String> bezStatus, MayBe<Double> gehalt, MayBe<String> password
			, MayBe<GregorianCalendar> gebDatum)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.bezStatus = bezStatus;
		this.gehalt = gehalt;
		this.password = password;
		this.gebDatum = gebDatum;
	}
	
	public void print()
	{
		System.out.println(vorname + " " + nachname);
		System.out.print("Alter: ");
		alter.print();
		System.out.print("Gehalt: ");
		gehalt.print();	
		System.out.print("Password: ");
		password.print();
		System.out.print("Beziehungsstatus: ");	
		bezStatus.print();
		System.out.print("Geburtsdatum: ");	
		gebDatum.print();
		
	}
	
	

}
