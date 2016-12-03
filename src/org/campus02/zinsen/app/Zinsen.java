package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Zinsberechnung;

public class Zinsen {

	public static void main(String[] args) {
		
		Zinsberechnung z = new Zinsberechnung(10000);
		
		z.zinsberechnung(100, 1);
		System.out.println(z.getZinsen());
	
		
	}

}
