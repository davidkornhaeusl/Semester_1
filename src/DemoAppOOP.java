
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
		
		System.out.println(Ich.Vorname+"\n"+Ich.Nachname+"\n"+Ich.Alter+"\n"+Ich.Address.strasse+" "+Ich.Address.hausnummer);

		
	}

}
