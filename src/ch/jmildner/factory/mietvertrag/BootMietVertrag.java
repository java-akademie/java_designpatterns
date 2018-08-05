package ch.jmildner.factory.mietvertrag;

public class BootMietVertrag extends MietVertrag
{
	@Override
	protected MietObjekt erstelleMietObjekt()
	{
		return new Boot();
	}
}
