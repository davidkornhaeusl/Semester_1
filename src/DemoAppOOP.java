
public class DemoAppOOP {

	public static void main(String[] args) {

		Person Ich = new Person();
		Ich.Vorname = "David";
		Ich.Nachname = "Kornhäusl";
		Ich.Alter = 24;
		Ich.Address = new Address();
		Ich.Address.strasse = "Grillenweg";
		Ich.Address.hausnummer = "1a";
		
		Ich.setAddress("Musterstrasse", "1");
		
		System.out.println(Ich.Vorname+"\n"+Ich.Nachname+"\n"+Ich.Alter+"\n"+Ich.Address.strasse+" "+Ich.Address.hausnummer+"\n\n");

		Konto[] konten = new Konto[1000];
		
		Konto max = new Konto();
		konten[0] = max;
		

		Konto susi = new Konto();
		konten[1] = susi;
		
		
		max.aufbuchen(300);

		if (max.abbuchen(200))
		{
			System.out.println("erfolgreich");
		}
		if (max.abbuchen(200))
		{
			System.out.println("erfolgreich");
		}
		
		for(int i = 0; i < konten.length; i++)
		{
			if(konten[i] != null)
				konten[i].abbuchen(10);
			else break;
		}
		
		
	}

}
