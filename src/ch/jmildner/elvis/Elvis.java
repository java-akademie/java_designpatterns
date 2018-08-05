package ch.jmildner.elvis;

/**
 * es gibt nur einen Elvis Singleton!
 */
public class Elvis implements Kuenstler
{
	int id;
	Interessent elvisManager;

	static Elvis elvis;


	/**
	 * die statische Referenz elvis wird beim ersten Aufruf gefuellt.
	 * 
	 * @param id id
	 * @return elvis
	 */
	synchronized public static Elvis getInstance(int id)
	{
		if (elvis == null)
		{
			elvis = new Elvis(id);
		}

		return elvis;
	}


	/**
	 * Singleton darf von aussen nicht instantiiert werden sondern nur
	 * aus der statischen get-Methode (getInstance).
	 * 
	 * @param id
	 */
	private Elvis(int id)
	{
		this.id = id;
		System.out.println("Elvis wurde aufgeboten ... " + id);
	}


	public void addInteressent(Interessent em)
	{
		System.out.println("addInteressent");
		elvisManager = em;
	}


	@Override
	public void singe()
	{
		System.out.println(elvis);
		System.out.println(this);

		System.out.println("ich singe ... " + id);
		elvisManager.benachrichtigung(id);
	}


	@Override
	public String toString()
	{
		return id + "";
	}

}
