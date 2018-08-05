package ch.jmildner.factory.pizzafabrik1;

public class SalamiPizzaZuerich extends Pizza
{
	public SalamiPizzaZuerich()
	{
		name = "Salami Pizza nach Zuerich-Art";
		teig = "Teig mit knuspriger Kruste";
		sosse = "Marinara-Sosse";

		belaege.add("Geriebener Parmesan");
		belaege.add("Salami in Scheiben");
	}


	@Override
	void schneiden()
	{
		System.out.println("Schneide die Pizza in rechteckige Stuecke");
	}
}
