package ch.jmildner.observer.verehrer;

import ch.jmildner.tools.MyTools;

public class Listener02 implements Verehrer
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("----------");
		System.out.println("Listener02");
		System.out.println("----------");
		new Listener02();
		MyTools.pause();
	}


	Listener02()
	{
		Dame d = new Dame();
		d.eventuellAnruf();
		d.addVerehrer(this);
		d.eventuellAnruf();
	}


	@Override
	public void anruf(int z)
	{
		System.out.println("hurra, der " + z + ". anruf");
	}
}
