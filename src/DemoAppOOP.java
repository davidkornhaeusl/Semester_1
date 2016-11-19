
public class DemoAppOOP {

	public static void main(String[] args) {

		Person Ich = new Person();
		Ich.Vorname = "David";
		Ich.Nachname = "Kornhäusl";
		Ich.Alter = 24;
		Ich.Strasse = "Grillenweg";
		Ich.Hausnummer = "1a";
		
		System.out.println(Ich.Vorname+"\n"+Ich.Nachname+"\n"+Ich.Alter+"\n"+Ich.Strasse+" "+Ich.Hausnummer);

	}

}
