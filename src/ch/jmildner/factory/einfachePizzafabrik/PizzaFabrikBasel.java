package ch.jmildner.factory.einfachePizzafabrik;

public class PizzaFabrikBasel implements PizzaFabrik
{
	@Override
	public Pizza pizzaErstellen(String typ)
	{
		Pizza pizza = null;

		if (typ.equals("SALAMI"))
		{
			pizza = new SalamiPizzaBasel();
		}

		if (typ.equals("SCHINKEN"))
		{
			pizza = new SchinkenPizzaBasel();
		}

		return pizza;
	}
}
