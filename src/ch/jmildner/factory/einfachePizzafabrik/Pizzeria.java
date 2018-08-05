package ch.jmildner.factory.einfachePizzafabrik;

public class Pizzeria
{
	private PizzaFabrik fabrik;


	public Pizzeria(PizzaFabrik fabrik)
	{
		this.fabrik = fabrik;
	}


	public Pizza bestellePizza(String typ)
	{
		Pizza p = fabrik.pizzaErstellen(typ);

		p.vorbereiten();
		p.backen();
		p.schneiden();
		p.einpacken();

		return p;
	}

}
