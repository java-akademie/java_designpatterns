package ch.jmildner.factory.pizzafabrik2;

public class PizzeriaBasel extends Pizzeria
{

	@Override
	Pizza pizzaErstellen(String item)
	{
		PizzaZutatenFabrik zutatenFabrik = new PizzaZutatenFabrikBasel();

		if (item.equals("SALAMI"))
		{
			Pizza pizza = new PizzaSalami(zutatenFabrik);
			pizza.setName("Salami-Pizza Basler Art");
			return pizza;
		}

		if (item.equals("VEGETARISCH"))
		{
			Pizza pizza = new PizzaVegetarisch(zutatenFabrik);
			pizza.setName("Vegetarische Pizza Basler Art");
			return pizza;
		}

		if (item.equals("KRABBEN"))
		{
			Pizza pizza = new PizzaKrabben(zutatenFabrik);
			pizza.setName("Krabben-Pizza Basler Art");
			return pizza;
		}

		if (item.equals("THUNFISCH"))
		{

			Pizza pizza = new PizzaThunfisch(zutatenFabrik);
			pizza.setName("Thunfisch-Pizza Basler Art");
			return pizza;
		}

		return null;
	}
}
