package ch.jmildner.observer.nachrichten;

class TestNachrichten
{
	static NachrichtenEmpfaenger s1, s2, s3;
	static NachrichtenQuelle p1, p2, p3;


	public static void main(String[] args)
	{
		s1 = new Subscriber("hugo meier    ");
		s2 = new Subscriber("max huber     ");
		s3 = new Subscriber("moritz gruber ");

		p1 = new Publisher("tagblatt    ");
		p2 = new Publisher("wochenschau ");
		p3 = new Publisher("kurier      ");

		p1.addAbonnent(s1);
		p2.addAbonnent(s1);
		p1.addAbonnent(s2);
		p3.addAbonnent(s2);
		p1.addAbonnent(s3);
		p2.addAbonnent(s3);
		p3.addAbonnent(s3);

		p1.neueNachricht("11.09.2002 mord            ");
		p1.neueNachricht("12.09.2002 entfuehrung     ");
		p2.neueNachricht("11.09.2002 diebstahl       ");
		p2.neueNachricht("12.09.2002 krieg           ");
		p3.neueNachricht("11.09.2002 erdbeben        ");
		p3.neueNachricht("12.09.2002 ueberschwemmung ");
	}
}
