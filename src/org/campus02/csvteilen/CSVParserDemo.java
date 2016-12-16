package org.campus02.csvteilen;

public class CSVParserDemo {

	public static void main(String[] args) {

		CSVParser teilen = new CSVParser("spalte1,spalte2,spalte3");
		
		teilen.parse();

	}

}
