package ch.jmildner.strategy.tiere;

public class TiereSprechenTest
{
	public static void main(String[] args)
	{
		System.out.println("--------------------------------------");
		System.out.println("TiereSprechen ... delegate");
		System.out.println("--------------------------------------");

		Animal wauHund = new Dog(new Wau());
		wauHund.sprich();

		Animal wuffHund = new Dog(new Wuff());
		wuffHund.sprich();

		Animal katze = new Cat();
		katze.sprich();

		Animal stummerFisch = new Fish();
		stummerFisch.sprich();

		Animal sprechFisch = new Fish(new SprechFisch());
		sprechFisch.sprich();

		System.out.println("--------------------------------------");
		System.out.println();
	}
}
