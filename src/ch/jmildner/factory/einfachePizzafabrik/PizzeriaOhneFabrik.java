package ch.jmildner.factory.einfachePizzafabrik;

public class PizzeriaOhneFabrik
{

	public Pizza bestellePizza(String typ)
	{
		Pizza p = null;

		if (typ.equals("SALAMI"))
		{
			p = new SalamiPizza();
		}

		if (typ.equals("SCHINKEN"))
		{
			p = new SchinkenPizza();
		}

		p.vorbereiten();
		p.backen();
		p.schneiden();
		p.einpacken();

		return p;
	}
}
