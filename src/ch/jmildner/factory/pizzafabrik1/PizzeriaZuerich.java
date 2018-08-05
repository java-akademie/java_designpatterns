package ch.jmildner.factory.pizzafabrik1;

public class PizzeriaZuerich extends Pizzeria
{
	@Override
	Pizza pizzaErstellen(String typ)
	{
		if (typ.equals("SALAMI"))
		{
			return new SalamiPizzaZuerich();
		}

		if (typ.equals("SCHINKEN"))
		{
			return new SchinkenPizzaZuerich();
		}

		return null;
	}
}
