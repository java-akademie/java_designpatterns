package ch.jmildner.factory.pizzafabrik2;

/**
 * @author johann
 */
public class TestPizzeria
{
	static Pizza p;


	public static void main(String[] args)
	{
		Pizzeria baslerPizzeria = new PizzeriaBasel();
		Pizzeria zuercherPizzeria = new PizzeriaZuerich();

		p = baslerPizzeria.bestellePizza("SALAMI");
		protokoll("Ethan", p);

		p = zuercherPizzeria.bestellePizza("SALAMI");
		protokoll("Joel", p);

		p = baslerPizzeria.bestellePizza("KRABBEN");
		protokoll("Ethan", p);

		p = zuercherPizzeria.bestellePizza("KRABBEN");
		protokoll("Joel", p);

		p = baslerPizzeria.bestellePizza("THUNFISCH");
		protokoll("Ethan", p);

		p = zuercherPizzeria.bestellePizza("THUNFISCH");
		protokoll("Joel", p);

		p = baslerPizzeria.bestellePizza("VEGETARISCH");
		protokoll("Ethan", p);

		p = zuercherPizzeria.bestellePizza("VEGETARISCH");
		protokoll("Joel", p);
	}


	private static void protokoll(String name, Pizza p)
	{
		System.out.println(name + " hat eine " + p.getName()
				+ " bestellt\n" + p);
	}
}
