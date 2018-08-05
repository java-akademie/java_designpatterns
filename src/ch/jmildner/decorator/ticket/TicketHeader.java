package ch.jmildner.decorator.ticket;

public class TicketHeader extends TicketDecorator
{
	public TicketHeader(Ticket auftrag, int id)
	{
		super(auftrag);
		this.id = id;
	}


	@Override
	public void print()
	{
		System.out.println("Besucher: " + id);
		System.out.println("-----------------------------------------");

		super.print();
	}

}
