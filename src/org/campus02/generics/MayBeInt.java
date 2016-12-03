package org.campus02.generics;

public class MayBeInt {

	private int data;
	private int status;
	
	public MayBeInt(int data, int status) {
		super();
		this.data = data;
		this.status = status;
	}
	
	public int getData()
	{
		return this.data;
	}

	public int getStatus()
	{
		return this.status;
	}
	
	public void print()
	{
		switch (status)
		{
		case 1: System.out.println("Zugriff gestattet: " + data);
		break;
		case 2: System.out.println("Zugriff nicht gestattet");
		break;
		case 3: System.out.println("Keine Daten vorhanden");
		break;
		default: System.out.println("Ungültiger Status");
		break;
		}
	}
	
}
