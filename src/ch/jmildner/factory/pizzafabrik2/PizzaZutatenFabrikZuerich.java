package ch.jmildner.factory.pizzafabrik2;

public class PizzaZutatenFabrikZuerich implements PizzaZutatenFabrik
{

	@Override
	public Gemuese[] erstelleGemuese()
	{
		Gemuese gemuese[] = { new SchwarzeOliven(), new Spinat(),
				new Aubergine() };
		return gemuese;
	}


	@Override
	public Kaese erstelleKaese()
	{
		return new Mozzarella();
	}


	@Override
	public Krabben erstelleKrabben()
	{
		return new GefroreneKrabben();
	}


	@Override
	public Salami erstelleSalami()
	{
		return new ItalienischeSalami();
	}


	@Override
	public Sosse erstelleSosse()
	{
		return new Tomatensosse();
	}


	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitDickerKruste();
	}


	@Override
	public Thunfisch erstelleThunfisch()
	{
		return new ThunfischStuecke();
	}

}
