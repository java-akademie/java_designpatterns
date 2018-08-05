package ch.jmildner.decorator.auftrag;

/**
 * Auftrag1.
 * 
 * Entwurfsmuster Decorator - Version 1
 * 
 * die Dekorator-Klassen erweitern die zu dekorierende Klasse
 * 
 */
class Auftrag1
{
	void print()
	{
		System.out.println("Body des Auftrags ");
	}
}



class AuftragFooter1 extends Auftrag1
{
	Auftrag1 auftrag;


	AuftragFooter1(Auftrag1 auftrag)
	{
		this.auftrag = auftrag;
	}


	@Override
	void print()
	{
		auftrag.print();
		System.out.println("Footer des Auftrags ");
	}
}



class AuftragHeader1 extends Auftrag1
{
	Auftrag1 auftrag;


	public AuftragHeader1(Auftrag1 auftrag)
	{
		this.auftrag = auftrag;
	}


	@Override
	public void print()
	{
		System.out.println("Header des Auftrags ");
		auftrag.print();
	}
}
