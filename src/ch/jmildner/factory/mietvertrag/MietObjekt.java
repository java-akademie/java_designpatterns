package ch.jmildner.factory.mietvertrag;

abstract public class MietObjekt
{
	abstract String name();


	@Override
	public String toString()
	{
		return name();
	}
}
