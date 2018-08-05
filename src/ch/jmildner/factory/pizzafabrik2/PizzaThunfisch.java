package ch.jmildner.factory.pizzafabrik2;

/**
 * @author johann
 */
public class PizzaThunfisch extends Pizza
{
	PizzaZutatenFabrik zutatenFabrik;


	public PizzaThunfisch(PizzaZutatenFabrik zutatenFabrik)
	{
		this.zutatenFabrik = zutatenFabrik;
	}


	@Override
	void vorbereiten()
	{
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		sosse = zutatenFabrik.erstelleSosse();
		kaese = zutatenFabrik.erstelleKaese();
		gemuese = zutatenFabrik.erstelleGemuese();
		thunfisch = zutatenFabrik.erstelleThunfisch();
	}
}
