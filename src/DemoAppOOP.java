
public class DemoAppOOP {

	public static void main(String[] args) {

		Person Ich = new Person();
		Ich.Vorname = "David";
		Ich.Nachname = "Kornh�usl";
		Ich.Alter = 24;
		Ich.Strasse = "Grillenweg";
		Ich.Hausnummer = "1a";
		
		System.out.println(Ich.Vorname+"\n"+Ich.Nachname+"\n"+Ich.Alter+"\n"+Ich.Strasse+" "+Ich.Hausnummer);

	}

}
