
public class Bank {

	public static void main(String[] args) {

		Gehaltskonto[] Gehaltskonten = new Gehaltskonto[10];
		Gehaltskonto max = new Gehaltskonto("Max Mustermann", "IBANmax0123", "BICmax"); 
		Gehaltskonto susi = new Gehaltskonto("Susi Sorglos", "IBANsusi456", "BICsusi"); 
		Gehaltskonto peter = new Gehaltskonto("Peter Müller", "IBANpeter789", "BICpeter"); 
		
		Gehaltskonten[0] = max;
		Gehaltskonten[1] = susi;
		Gehaltskonten[2] = peter;

		max.aufbuchen(50.3);
		susi.aufbuchen(173.9);
		peter.aufbuchen(617.5);

		max.abbuchen(10.7);
		susi.abbuchen(25.4);
		peter.abbuchen(255.6);
		
		for(int i = 0; i < Gehaltskonten.length; i++)
		{
			if(Gehaltskonten[i] != null)
			System.out.println("Kontostand: "+Gehaltskonten[i].getKontostand());
			
			else
				break;
		}
		
	}

}
