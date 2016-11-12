
public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] Array1 = {3,4,5};
		int[] Array2 = new int[3];

		Array2[0] = 7;
		Array2[1] = 1;
		Array2[2] = 3;

		System.out.println("Addition:");
		System.out.println("Array1[0]+Array2[0] = "+(Array1[0]+Array2[0]));
		System.out.println("Array1[1]+Array2[1] = "+(Array1[1]+Array2[1]));
		System.out.println("Array1[2]+Array2[2] = "+(Array1[2]+Array2[2]));
		
		System.out.println("Multiplikation:");
		System.out.println("Array1[0]*Array2[0] = "+(Array1[0]*Array2[0]));
		System.out.println("Array1[1]*Array2[1] = "+(Array1[1]*Array2[1]));
		System.out.println("Array1[2]*Array2[2] = "+(Array1[2]*Array2[2]));
	}

}
