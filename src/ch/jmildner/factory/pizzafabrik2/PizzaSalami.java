package ch.jmildner.factory.pizzafabrik2;

/**
 * @author johann
 */
public class PizzaSalami extends Pizza
{
	PizzaZutatenFabrik zutatenFabrik;


	public PizzaSalami(PizzaZutatenFabrik zutatenFabrik)
	{
		this.zutatenFabrik = zutatenFabrik;
	}


	@Override
	void vorbereiten()
	{
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		sosse = zutatenFabrik.erstelleSosse();
		salami = zutatenFabrik.erstelleSalami();
		kaese = zutatenFabrik.erstelleKaese();
	}
}
