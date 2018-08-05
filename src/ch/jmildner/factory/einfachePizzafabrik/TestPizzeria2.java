package ch.jmildner.factory.einfachePizzafabrik;

public class TestPizzeria2
{

	public static void main(String[] args)
	{
		testAufgabe1();
	}


	/**
	 * Test zweier PizzaFabriken (Zuerich, Basel) sowie weiterer Pizzen
	 * (SalamiPizzaZuerich, SchinkenPizzaZuerich, SalamiPizzaBasel,
	 * SchinkenPizzaBasel).
	 */
	private static void testAufgabe1()
	{
		System.out.println("\nTest PizzeriaFabriken Zuerich, Basel");

		System.out.println("\nZuerich");

		PizzaFabrikZuerich fabrikZH = new PizzaFabrikZuerich();

		Pizzeria pizzeriaZH = new Pizzeria(fabrikZH);

		Pizza pizzaZH1 = pizzeriaZH.bestellePizza("SALAMI");
		pizzaZH1.zeigen();

		Pizza pizzaZH2 = pizzeriaZH.bestellePizza("SCHINKEN");
		pizzaZH2.zeigen();

		System.out.println("\nBasel");

		PizzaFabrikBasel fabrikBS = new PizzaFabrikBasel();

		Pizzeria pizzeriaBS = new Pizzeria(fabrikBS);

		Pizza pizzaBS1 = pizzeriaBS.bestellePizza("SALAMI");
		pizzaBS1.zeigen();

		Pizza pizzaBS2 = pizzeriaBS.bestellePizza("SCHINKEN");
		pizzaBS2.zeigen();
	}
}
