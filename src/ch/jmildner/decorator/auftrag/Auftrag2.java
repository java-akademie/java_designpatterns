package ch.jmildner.decorator.auftrag;

class Auftrag2 implements Auftrag2Interface
{
	@Override
	public void print()
	{
		System.out.println("Body des Auftrags ");
	}
}



/**
 * Auftrag2.
 * 
 * Entwurfsmuster Decorator - Version 2
 * 
 * die Dekorator-Klassen implementieren das Interface der zu
 * dekorierenden Klasse
 * 
 */
interface Auftrag2Interface
{
	void print();
}



class AuftragFooter2 implements Auftrag2Interface
{
	Auftrag2Interface auftrag;


	AuftragFooter2(Auftrag2Interface auftrag)
	{
		this.auftrag = auftrag;
	}


	@Override
	public void print()
	{
		auftrag.print();
		System.out.println("Footer des Auftrags ");
	}
}



class AuftragHeader2 implements Auftrag2Interface
{
	Auftrag2Interface auftrag;


	public AuftragHeader2(Auftrag2Interface auftrag)
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
