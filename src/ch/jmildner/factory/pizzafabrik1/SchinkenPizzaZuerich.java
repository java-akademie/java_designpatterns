package ch.jmildner.factory.pizzafabrik1;

public class SchinkenPizzaZuerich extends Pizza
{
	public SchinkenPizzaZuerich()
	{
		name = "Schinken Pizza nach Zuerich-Art";
		teig = "Teig mit knuspriger Kruste";
		sosse = "Marinara-Sosse";

		belaege.add("Geriebener Parmesan");
		belaege.add("Schinken in Scheiben");
	}
}
