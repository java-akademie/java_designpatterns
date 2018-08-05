package ch.jmildner.factory.pizzafabrik1;

public class SchinkenPizzaBasel extends Pizza
{
	public SchinkenPizzaBasel()
	{
		name = "Schinken Pizza nach Basel-Art";
		teig = "Teig mit extra dicker Kruste";
		sosse = "Tomatensosse";

		belaege.add("Parmesan");
		belaege.add("Schinken in Scheiben");
	}
}
