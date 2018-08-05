package ch.jmildner.strategy.tiere;

abstract class Animal
{
	private Stimme stimme;


	protected void setStimme(Stimme stimme)
	{
		this.stimme = stimme;
	}


	public void sprich()
	{
		if (stimme == null)
		{
			System.out.println("(ich bin stumm ...)");
		}
		else
		{
			stimme.sprich();
		}
	}
}



class Cat extends Animal
{
	Cat()
	{
		setStimme(new Miau());
	}
}



class Dog extends Animal
{
	Dog(Stimme stimme)
	{
		setStimme(stimme);
	}
}



class Fish extends Animal
{
	Fish()
	{
		// setStimme(new NoSound());
	}


	Fish(Stimme stimme)
	{
		setStimme(stimme);
	}
}



class Miau implements Stimme
{
	@Override
	public void sprich()
	{
		System.out.println("miau ...");
	}
}



class NoSound implements Stimme
{
	@Override
	public void sprich()
	{
		System.out.println("(ich bin stumm ...)");
	}
}



class SprechFisch implements Stimme
{
	@Override
	public void sprich()
	{
		System.out.println("was kuckst du? "
				+ "hast do noch keinen sprechenden Fisch gesehen ...");
	}
}



interface Stimme
{
	void sprich();
}



class Wau implements Stimme
{
	@Override
	public void sprich()
	{
		System.out.println("wau wau ...");
	}
}



class Wuff implements Stimme
{
	@Override
	public void sprich()
	{
		System.out.println("wuff wuff ...");
	}
}
