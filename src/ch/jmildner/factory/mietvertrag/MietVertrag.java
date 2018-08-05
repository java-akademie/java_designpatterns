package ch.jmildner.factory.mietvertrag;

public abstract class MietVertrag
{
	private MietObjekt mietObjekt = null;


	abstract protected MietObjekt erstelleMietObjekt();


	public void erstelleMietVertrag()
	{
		if (mietObjekt == null) // singleton
		{
			mietObjekt = erstelleMietObjekt();
			titel();
		}
		else
		{
			System.out.println("es kann nur einen Mietvertrag geben");
		}
	}


	private void titel()
	{
		System.out.println("mietvertrag fuer " + mietObjekt);
	}
}
