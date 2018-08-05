package ch.jmildner.factory.einfachePizzafabrik;

public class TestPizzeria
{

	public static void main(String[] args)
	{
		testPizzeria();
		testPizzeriaMitEinfacherPizzaFabrik();
	}


	private static void testPizzeria()
	{
		System.out.println("\nTest Pizzeria ohne PizzaFabrik");

		PizzeriaOhneFabrik pizzeria = new PizzeriaOhneFabrik();

		Pizza p1 = pizzeria.bestellePizza("SALAMI");
		p1.zeigen();

		Pizza p2 = pizzeria.bestellePizza("SCHINKEN");
		p2.zeigen();
	}


	private static void testPizzeriaMitEinfacherPizzaFabrik()
	{
		System.out.println("\nTest Pizzeria mit einfacher PizzaFabrik");

		PizzaFabrik fabrik = new EinfachePizzaFabrik();

		Pizzeria pizzeria = new Pizzeria(fabrik);

		Pizza p1 = pizzeria.bestellePizza("SALAMI");
		p1.zeigen();

		Pizza p2 = pizzeria.bestellePizza("SCHINKEN");
		p2.zeigen();
	}
}
