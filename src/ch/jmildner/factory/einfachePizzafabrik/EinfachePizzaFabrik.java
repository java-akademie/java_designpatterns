package ch.jmildner.factory.einfachePizzafabrik;

public class EinfachePizzaFabrik implements PizzaFabrik
{
	@Override
	public Pizza pizzaErstellen(String typ)
	{
		Pizza pizza = null;

		if (typ.equals("SALAMI"))
		{
			pizza = new SalamiPizza();
		}

		if (typ.equals("SCHINKEN"))
		{
			pizza = new SchinkenPizza();
		}
		return pizza;
	}
}
