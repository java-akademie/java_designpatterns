package ch.jmildner.elvis;

class Elvis2
{

	public static class InstanceHolderElvis2
	{
		private static final Elvis2 e = new Elvis2();


		public static final Elvis2 getInstance()
		{
			return e;
		}


		private InstanceHolderElvis2()
		{
		}
	}
}



public class Test
{

	public static void main(String[] args)
	{
		// InstanceHolderElvis2 el2 = new InstanceHolderElvis2();
		System.out.println("start");
		@SuppressWarnings("unused")
		Elvis2 e2 = Elvis2.InstanceHolderElvis2.getInstance();

	}

}
