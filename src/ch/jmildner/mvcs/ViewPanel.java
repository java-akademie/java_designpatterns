package ch.jmildner.mvcs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewPanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	JTextField betrag = new JTextField("1", 5);
	JTextField saldo = new JTextField("0", 10);
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton quit1 = new JButton("quit1");
	JButton quit2 = new JButton("quit2");


	public ViewPanel()
	{
		makeTheLayout();
		addTheListener();
		makeMvcVerbindung();
	}


	private void addTheListener()
	{
		quit1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("" + "q1 verarbeitung in panel");
				System.exit(0);
			}
		});
	}


	private void makeMvcVerbindung()
	{
		Model model = new Model(betrag);
		ModelObserver modelObserver = new ModelObserver(saldo);
		Controller controller = new Controller(model);
		add.addActionListener(controller);
		sub.addActionListener(controller);
		quit2.addActionListener(controller);
		model.addObserver(modelObserver);
		model.setSaldo(0);
	}


	private void makeTheLayout()
	{
		JPanel n = new JPanel();
		JPanel s = new JPanel();
		n.add(betrag);
		n.add(add);
		n.add(sub);
		n.add(saldo);
		s.add(quit1);
		s.add(quit2);
		add(n);
		add(s);
	}
}
