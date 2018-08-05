package ch.jmildner.decorator.ticket;

public class TicketFooter extends TicketDecorator
{
	public TicketFooter(Ticket auftrag, int id)
	{
		super(auftrag);
		this.id = id;
	}


	@Override
	public void print()
	{
		super.print();

		System.out.println("-----------------------------------------");
		System.out.println("Zahlungspflichtiger: " + id);
		System.out.println("Ueberweisen Sie den Preis von ");
		System.out.println("TALER " + getPrice());
		System.out.println("auf das Konto 4711");
		System.out.println("bei BANKHAUS DUCK in ENTENHAUSEN");
	}
}
