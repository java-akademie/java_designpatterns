package ch.jmildner.mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class MvcPanel extends JPanel
{

	class JPanelx extends JPanel
	{
		/**
		 * Comment for <code>serialVersionUID</code>
		 */
		private static final long serialVersionUID = 1L;


		JPanelx()
		{
			this("mvc");
		}


		JPanelx(String x)
		{
			if (test)
			{
				Border border;
				border = BorderFactory.createEtchedBorder();
				border = BorderFactory.createTitledBorder(x);
				setBackground(Color.green);
				setBorder(border);
			}
			else
			{
				setBackground(Color.yellow);
			}
		}
	}

	private static final long serialVersionUID = 1L;
	boolean test = true;
	JTextField betrag = new JTextField("1", 10);
	JTextField saldo = new JTextField("0", 10);
	JButton einzahlen = new JButton("einzahlen");
	JButton abheben = new JButton("abheben  ");
	JButton quit = new JButton("quit     ");
	JButton motif = new JButton("motif");
	JButton metal = new JButton("metal");
	JButton windows = new JButton("windows");
	Account acct = new Account();
	// Observer
	Amount firstBalance = new Amount(0, 0, 1, "Euro");
	AmountViewer av = new AmountViewer(saldo);
	EinzahlungController ec = new EinzahlungController(betrag, acct);


	AbhebungController ac = new AbhebungController(betrag, acct);


	public MvcPanel()
	{
		makeTheLayout();
		setToolTipps();
		addTheListener();
	}


	private void addTheListener()
	{
		einzahlen.addActionListener(ec);
		abheben.addActionListener(ac);
		acct.addObserver(av);
		acct.setBalance(firstBalance);
		motif.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				setLF("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			}
		});
		metal.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				setLF("javax.swing.plaf.metal.MetalLookAndFeel");
			}
		});
		windows.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				setLF("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}
		});
		quit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
	}


	private JPanel makeDaten()
	{
		JPanel n = makeDatenNorth();
		JPanel c = makeDatenCenter();
		JPanel s = makeDatenSouth();
		JPanel p = new JPanelx("daten");
		p.setLayout(new BorderLayout());
		p.add(BorderLayout.NORTH, n);
		p.add(BorderLayout.CENTER, c);
		p.add(BorderLayout.SOUTH, s);
		return p;
	}


	private JPanel makeDatenCenter()
	{
		JPanel p = new JPanelx("daten center");
		p.add(new JLabel("Betrag: "));
		p.add(betrag);
		p.add(new JLabel("Euro "));
		return p;
	}


	private JPanel makeDatenNorth()
	{
		JPanel p = new JPanelx("daten north");
		p.add(einzahlen);
		p.add(abheben);
		p.add(quit);
		return p;
	}


	private JPanel makeDatenSouth()
	{
		JPanel p = new JPanelx("daten south");
		p.add(new JLabel(" Saldo: "));
		p.add(saldo);
		p.add(new JLabel("Euro "));
		return p;
	}


	private JPanel makeFuss()
	{
		JPanel lf = new JPanelx("look and feel links");
		JPanel cr = new JPanelx("copyright rechts");
		JLabel n = new JLabel("", SwingConstants.CENTER);
		JLabel s = new JLabel("", SwingConstants.CENTER);
		JLabel o = new JLabel("", SwingConstants.RIGHT);
		JLabel w = new JLabel("", SwingConstants.LEFT);
		JLabel c = new JLabel("", SwingConstants.CENTER);
		JLabel x = new JLabel("johann mildner, basel ",
				SwingConstants.RIGHT);
		cr.setLayout(new BorderLayout());
		cr.add(BorderLayout.NORTH, n);
		cr.add(BorderLayout.SOUTH, s);
		cr.add(BorderLayout.EAST, o);
		cr.add(BorderLayout.WEST, w);
		cr.add(BorderLayout.CENTER, c);
		cr.add(BorderLayout.EAST, x);
		lf.add(motif);
		lf.add(metal);
		lf.add(windows);
		JPanel p = new JPanelx("fuss");
		p.setLayout(new BorderLayout());
		p.add(BorderLayout.WEST, lf);
		p.add(BorderLayout.EAST, cr);
		return p;
	}


	private JPanel makeKopf()
	{
		JLabel n = new JLabel("", SwingConstants.CENTER);
		JLabel s = new JLabel("", SwingConstants.CENTER);
		JLabel o = new JLabel("", SwingConstants.RIGHT);
		JLabel w = new JLabel("", SwingConstants.LEFT);
		JLabel c = new JLabel(
				"Bankkontenbeispiel (Model View Controller)",
				SwingConstants.CENTER);
		c.setFont(new Font("Serif", Font.BOLD, 32));
		JPanel p = new JPanelx("kopf");
		p.setLayout(new BorderLayout());
		p.add("North", n);
		p.add("South", s);
		p.add("East", o);
		p.add("West", w);
		p.add("Center", c);
		return p;
	}


	private void makeTheLayout()
	{
		JPanel pKopf = makeKopf();
		// Ueberschrift:
		JPanel pDaten = makeDaten();
		// Einbabebereich, Ausgabebereich
		JPanel pFuss = makeFuss();
		// copyright, Autor
		setLayout(new BorderLayout());
		add("North", pKopf);
		add("Center", pDaten);
		add("South", pFuss);
		setLF("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
	}


	private void setLF(String plaf)
	{
		System.out.println("look and feel: " + plaf);
		try
		{
			UIManager.setLookAndFeel(plaf);
			SwingUtilities.updateComponentTreeUI(this);
			System.out.println("ok");
		}
		catch (Exception e)
		{
			System.out.println("l und f fehler");
		}
	}

	private void setToolTipps()
	{
		quit.setToolTipText("beenden Sie die Anwendung");
		motif.setToolTipText("Look and Feel umschalten (Motif)");
		windows.setToolTipText("Look and Feel umschalten (Windwos)");
		metal.setToolTipText("Look and Feel umschalten (Metal)");
	}
}
