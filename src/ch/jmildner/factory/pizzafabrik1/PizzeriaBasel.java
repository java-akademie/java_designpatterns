package ch.jmildner.factory.pizzafabrik1;

public class PizzeriaBasel extends Pizzeria
{
	@Override
	Pizza pizzaErstellen(String typ)
	{
		if (typ.equals("SALAMI"))
		{
			return new SalamiPizzaBasel();
		}

		if (typ.equals("SCHINKEN"))
		{
			return new SchinkenPizzaBasel();
		}

		return null;
	}
}
