package ch.jmildner.factory.mietvertrag;

public class AutoMietVertrag extends MietVertrag
{
	@Override
	protected MietObjekt erstelleMietObjekt()
	{
		return new Auto();
	}
}
