
public class ArrayMatrix {

	public static void main(String[] args) {
		
		int[][] Array = new int[4][4];
		
				
		for(int i = 0; i < Array.length; i++)
		{
			for(int j = 0; j < Array.length; j++)
			{
				if(i==j)
				{
					Array[i][j] = 1;	
				}
				else
				{
					Array[i][j] = 0;	
				}
				if(j<(Array.length-1))
				{
					System.out.print(Array[i][j]+" ");					
				}
				else
				{
					System.out.println(Array[i][j]);
				}
				
			}
		}
			
			
		

	}

}
