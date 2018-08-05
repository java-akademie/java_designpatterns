package ch.jmildner.mvc;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

public class AmountViewer implements Observer
{
	static int i = 100;
	protected JTextField myTextField;


	public AmountViewer(JTextField tf)
	{
		myTextField = tf;
		System.out.println("amount viewer konst");
	}


	@Override
	public void update(Observable o, Object arg)
	{
		Amount a = (Amount) arg;
		myTextField.setText(a + "");
		System.out.println("amount viewer update" + i);
		i++;
	}
}
