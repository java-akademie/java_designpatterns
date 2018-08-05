package ch.jmildner.factory.pizzafabrik1;

public class TestPizzeria
{
	static Pizza p;


	public static void main(String[] args)
	{
		System.out.println("\nTest");

		Pizzeria basel = new PizzeriaBasel();
		Pizzeria zuerich = new PizzeriaZuerich();

		p = zuerich.bestellePizza("SALAMI");
		p = basel.bestellePizza("SCHINKEN");
		p = zuerich.bestellePizza("SCHINKEN");
		p = basel.bestellePizza("SALAMI");
	}
}
