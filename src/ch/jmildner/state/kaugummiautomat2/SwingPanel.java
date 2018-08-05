package ch.jmildner.state.kaugummiautomat2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SwingPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private KaugummiAutomat ka = new KaugummiAutomat("ZUERICH HBF", 5);

	JButton b1 = new JButton("Muenze einwerfen");
	JButton b2 = new JButton("Griff drehen");
	JButton b3 = new JButton("Muenze zurueckholen");
	JButton b41 = new JButton("Automat auffuellen (5 Kugeln)");
	JButton b42 = new JButton("Automat leeren");
	JButton b5 = new JButton("Status anzeigen)");
	JButton b6 = new JButton("BEENDEN");
	JTextArea tf1 = new JTextArea(8, 80);


	public SwingPanel()
	{
		makeTheLayout();
		addTheListener();
	}


	private void addTheListener()
	{
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(ka.muenzeEinwerfen());
			}
		});
		b2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(ka.griffDrehen());
			}
		});
		b3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(ka.muenzeAuswerfen());
			}
		});
		b41.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(ka.auffuellen(5));
			}
		});
		b42.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(ka.auffuellen(-ka.getAnzahlKugeln()));
			}
		});
		b5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(ka.toString());
			}
		});
		b6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
	}


	private void makeTheLayout()
	{
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setLayout(new GridLayout(7, 1));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b41);
		p1.add(b42);
		p1.add(b5);
		p1.add(b6);
		p2.add(tf1);
		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}
}
