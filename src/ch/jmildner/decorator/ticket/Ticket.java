package ch.jmildner.decorator.ticket;

/**
 * zu dekorierende Klasse
 */
public class Ticket
{
	static private int zaehler = 0;

	private int ticketNumber;
	private String event;
	private int price;


	public Ticket(int ticketNumber, String event, int price)
	{
		this.ticketNumber = ticketNumber;
		this.event = event;
		this.price = price;
	}


	public Ticket(String event, int price)
	{
		this.ticketNumber = ++zaehler;
		this.event = event;
		this.price = price;
	}


	public String getEvent()
	{
		return event;
	}


	public int getPrice()
	{
		return price;
	}


	int getTicketNumber()
	{
		return ticketNumber;
	}


	void print()
	{
		System.out.println("ticketNumber = " + ticketNumber);
		System.out.println("event = " + event);
		System.out.println("price = " + price);
	}
}
