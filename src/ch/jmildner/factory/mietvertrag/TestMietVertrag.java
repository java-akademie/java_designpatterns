package ch.jmildner.factory.mietvertrag;

public class TestMietVertrag
{
	public static void main(String[] args)
	{
		MietVertrag mietVertrag1 = new AutoMietVertrag();
		MietVertrag mietVertrag2 = new BootMietVertrag();
		mietVertrag1.erstelleMietVertrag();
		mietVertrag2.erstelleMietVertrag();
	}
}
