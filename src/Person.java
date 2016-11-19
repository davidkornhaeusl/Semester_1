
public class Person {

		public String Vorname;
		public String Nachname;
		public int Alter;
		public Address Address;

		public void setAddress(String strasse, String hausnummer)
		{
			Address = new Address();
			Address.strasse = strasse;
			Address.hausnummer = hausnummer;
		}
		
}
