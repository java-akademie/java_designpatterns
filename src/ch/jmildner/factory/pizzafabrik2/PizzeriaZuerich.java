package ch.jmildner.factory.pizzafabrik2;

public class PizzeriaZuerich extends Pizzeria
{

	@Override
	Pizza pizzaErstellen(String item)
	{
		PizzaZutatenFabrik zutatenFabrik = new PizzaZutatenFabrikZuerich();

		if (item.equals("SALAMI"))
		{
			Pizza pizza = new PizzaSalami(zutatenFabrik);
			pizza.setName("Salami-Pizza Zuercher Art");
			return pizza;
		}

		if (item.equals("VEGETARISCH"))
		{
			Pizza pizza = new PizzaVegetarisch(zutatenFabrik);
			pizza.setName("Vegetarische Pizza Zuercher Art");
			return pizza;
		}

		if (item.equals("KRABBEN"))
		{
			Pizza pizza = new PizzaKrabben(zutatenFabrik);
			pizza.setName("Krabben-Pizza Zuercher Art");
			return pizza;
		}

		if (item.equals("THUNFISCH"))
		{

			Pizza pizza = new PizzaThunfisch(zutatenFabrik);
			pizza.setName("Thunfisch-Pizza Zuercher Art");
			return pizza;
		}

		return null;
	}
}
