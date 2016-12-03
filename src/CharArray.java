
public class CharArray {

	private char[] internalArray;
	
	public static int anzahlObjekte;
	
	public CharArray(char[] internalArray)
	{
		this.internalArray = internalArray;
		anzahlObjekte++;
	}
	
	public void print()
	{
		for(int i = 0; i < internalArray.length; i++)
		{
			System.out.print(internalArray[i]);			
		}
		System.out.println();	
	}
	
	public void print(int start, int end)
	{
		if(start >= 0 
				&& end >= start 
				&& end < internalArray.length)
		{
		for(int i = start; i < end; i++)
			System.out.print(internalArray[i]);
		}
		System.out.println();	
	}
	
	public int length()
	{
		return internalArray.length;
	}
	
	
	
}
