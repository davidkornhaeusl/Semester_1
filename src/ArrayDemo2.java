
public class ArrayDemo2 {

	public static void main(String[] args) {


		String[] Monate = 
			{"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		
		
		for (int m=0; m < Monate.length; m++)
		{
			System.out.println(Monate[m]+" ["+(m+1)+"]");
		}

	}

}
