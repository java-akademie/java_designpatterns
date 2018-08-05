package ch.jmildner.factory.einfachePizzafabrik;

public class PizzaFabrikZuerich implements PizzaFabrik
{
	@Override
	public Pizza pizzaErstellen(String typ)
	{
		Pizza pizza = null;

		if (typ.equals("SALAMI"))
		{
			pizza = new SalamiPizzaZuerich();
		}

		if (typ.equals("SCHINKEN"))
		{
			pizza = new SchinkenPizzaZuerich();
		}

		return pizza;
	}
}
