package ch.jmildner.strategy.allgemein;

public class StrategieTest
{
	public static void main(String[] args)
	{
		Kontext k = new Kontext(new ErsteStrategie());
		k.doCommon();
		k.operate();

		k.setStrategie(new ZweiteStrategie());
		k.doCommon();
		k.operate();
	}
}
