package org.campus02.großbuchstaben;

public class WortDemo {

	public static void main(String[] args) {

		String start = "Wörter werden immer Groß geschrieben";
		char[] startArray = start.toCharArray();

		Groß a = new Groß(startArray);
		
		a.convert();
		

	}

}
