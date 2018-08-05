package ch.jmildner.factory.pizzafabrik1;

public class SalamiPizzaBasel extends Pizza
{
	public SalamiPizzaBasel()
	{
		name = "Salami Pizza nach Basel-Art";
		teig = "Teig mit extra dicker Kruste";
		sosse = "Tomatensosse";

		belaege.add("Mozzarella");
		belaege.add("Salami in Scheiben");
	}


	@Override
	void schneiden()
	{
		System.out.println("Schneide die Pizza in rechteckige Stuecke");
	}
}
