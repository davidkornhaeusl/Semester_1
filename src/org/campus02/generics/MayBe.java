package org.campus02.generics;

public class MayBe<T> {
	
	private T data;
	private int status;
	
	public MayBe(T data, int status) {
		super();
		this.data = data;
		this.status = status;
	}
	
	public T getData()
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
