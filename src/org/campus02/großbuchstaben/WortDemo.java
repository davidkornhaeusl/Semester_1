package org.campus02.gro�buchstaben;

public class WortDemo {

	public static void main(String[] args) {

		String start = "W�rter werden immer Gro� geschrieben";
		char[] startArray = start.toCharArray();

		Gro� a = new Gro�(startArray);
		
		a.convert();
		

	}

}
