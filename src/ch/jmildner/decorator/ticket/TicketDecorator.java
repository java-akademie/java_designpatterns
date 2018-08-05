package ch.jmildner.decorator.ticket;

/**
 * Dieser <code> TicketDecorator </code> dient der Dekorierung des
 * Tickets.
 * 
 * Die Tickets werden nun seit Jahren in der Form: TicketNummer, Event,
 * Preis an der Kassa ausgedruckt.
 * 
 * Eine neue Anforderung fordert nun, dass fuer manche Tickets ein Kopf
 * mit den Besucherdaten gedruckt werden muss. Fuer andere Tickets muss
 * ein Fuss mit einem Einzahlungsschein fuer die Bezahlung ueber Post
 * oder Bank gedruckt werden. Es ist auch Kopf und Body und Fuss
 * vorgesehen.
 * 
 * Dem TicketHeader ist als zusaetzlicher Parameter die ID des Besuchers
 * mitzugeben.
 * 
 * Dem TicketFooter ist als zusaetzlicher Parameter die ID des
 * Zahlungspflichtigen mitzugeben.
 * 
 */
abstract class TicketDecorator extends Ticket
{
	private Ticket ticket;
	protected int id;


	public TicketDecorator(Ticket ticket)
	{
		super(ticket.getTicketNumber(), ticket.getEvent(), ticket
				.getPrice());
		this.ticket = ticket;
	}


	@Override
	public void print()
	{
		ticket.print();
	}
}
