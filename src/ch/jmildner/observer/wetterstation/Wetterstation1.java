package ch.jmildner.observer.wetterstation;

class DisplayDevice11
{
	void update(int anz, double t, double h, double p)
	{
		System.out.println("");
		System.out.println("CurrentConditions Messung " + anz);
		System.out.println("--------------------------------");
		System.out.println("Temperature : " + t);
		System.out.println("Humidity    : " + h);
		System.out.println("Pressure    : " + p);
	}
}



class DisplayDevice12
{
	void update(int anz, double t, double h, double p)
	{
		System.out.println("");
		System.out.println("Statistics        Messung " + anz);
		System.out.println("--------------------------------");
		System.out.println("Temperature : " + t);
		System.out.println("Humidity    : " + h);
		System.out.println("Pressure    : " + p);
	}
}



public class Wetterstation1
{
	public static void main(String[] args)
	{
		System.out.println("Wetterstation");

		Wetterstation1 ws = new Wetterstation1();

		ws.measurementChanged(1.03);
		ws.measurementChanged(1.00);
		ws.measurementChanged(1.05);
		ws.measurementChanged(0.98);
	}
	private int anzMessungen;
	private double temperature;
	private double humidity;

	private double pressure;
	DisplayDevice11 dd1 = new DisplayDevice11();


	DisplayDevice12 dd2 = new DisplayDevice12();


	void measurementChanged(double d)
	{
		anzMessungen++;

		// getMethoden
		temperature = 23 * d;
		humidity = 60 * d;
		pressure = 1000 * d;

		// aufruf der update-Methoden der DisplayDevices
		dd1.update(anzMessungen, temperature, humidity, pressure);
		dd2.update(anzMessungen, temperature, humidity, pressure);
	}
}
