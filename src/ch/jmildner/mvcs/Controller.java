package ch.jmildner.mvcs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener
{
	private Model model;


	public Controller(Model model)
	{
		this.model = model;
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("+"))
		{
			model.saldoErhoehen();
			return;
		}
		if (e.getActionCommand().equals("-"))
		{
			model.saldoVermindern();
			return;
		}
		if (e.getActionCommand().equals("quit2"))
		{
			System.out.println("" + "q2 verarbeitung in controller\n"
					+ " moegliche endeverarbeitung!");
			System.exit(0);
			return;
		}
		System.out.println("weder + noch - gedrueckt!");
	}
}
