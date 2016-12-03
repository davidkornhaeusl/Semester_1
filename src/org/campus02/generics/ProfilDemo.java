package org.campus02.generics;

import java.util.GregorianCalendar;

public class ProfilDemo {
    
	public static void main(String[] args) {
	    
		Profil p = new Profil("Max", "Mustermann", 
					new MayBe<Integer>(24, 1)
					, new MayBe<String>("Single", 1)
					, new MayBe<Double>(2400.76, 1)
					, new MayBe<String>("Passwort", 2)
					, new MayBe<GregorianCalendar>(new GregorianCalendar(1980, 1 ,2), 1));
		
		p.print();
		
		Integer number = new Integer(4711);
		System.out.println(number.intValue());
		
		Integer number2 = new Integer("4711");
		System.out.println(number2.intValue());
				
		int value2 = Integer.parseInt("4711");
		System.out.println(value2);

	}

}
