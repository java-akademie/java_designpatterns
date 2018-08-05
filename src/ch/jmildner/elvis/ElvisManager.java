package ch.jmildner.elvis;

/**
 * da es nur einen Elvis gibt, gibt es auch nur einen Manager Singleton!
 */
public class ElvisManager implements Interessent
{
	static ElvisManager elvisManager;


	/**
	 * die statische Referenz elvisManager wird beim ersten Aufruf
	 * gefuellt.
	 * 
	 * @return elvisManager
	 */
	static public ElvisManager getInstance()
	{
		if (elvisManager == null)
		{
			elvisManager = new ElvisManager();
		}

		return elvisManager;
	}


	/**
	 * Singleton darf von aussen nicht instantiiert werden sondern nur
	 * aus der statischen get-Methode (getInstance).
	 */
	private ElvisManager()
	{
		Elvis.getInstance(99).addInteressent(this);
	}


	@Override
	public void benachrichtigung(int id)
	{
		System.out.println("hurra die kasse klingelt ... " + id);
	}
}
