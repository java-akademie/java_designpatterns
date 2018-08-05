package ch.jmildner.observer.verehrer;

import ch.jmildner.tools.MyTools;

public class Listener01
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("----------");
		System.out.println("Listener01");
		System.out.println("----------");
		Dame d = new Dame();
		d.addVerehrer(new Verehrer()
		{
			@Override
			public void anruf(int z)
			{
				System.out.println("hurra, der " + z + ". anruf");
			}
		});
		d.eventuellAnruf();
		MyTools.pause();
	}
}
