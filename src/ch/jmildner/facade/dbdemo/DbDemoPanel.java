package ch.jmildner.facade.dbdemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class DbDemoPanel extends JPanel implements ActionListener, CaretListener
{
	private static final long serialVersionUID = 1L;

	JTextArea taTables = new JTextArea(10, 25);
	JTextArea taColumns = new JTextArea(10, 25);
	JTextArea taData = new JTextArea(10, 25);
	JTextArea taSql = new JTextArea(5, 80);
	JButton run = new JButton("Run Query");
	JButton quit = new JButton("Quit");
	DbDemo mdb = new DbDemo();


	Connection connection = null;


	Statement statement;


	DatabaseMetaData databaseMetaData;


	ResultSet resultSet;


	String table;


	public DbDemoPanel() throws Exception
	{
		makeTheLayout();
		addTheListener();
		fillTheLayout();
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == quit)
		{
			System.exit(0);
		}
		if (e.getSource() == run)
		{
			System.out.println("run gedrueckt");
		}
	}


	private void addTheListener()
	{
		run.addActionListener(this);
		quit.addActionListener(this);
		taTables.addCaretListener(this);
	}


	@Override
	public void caretUpdate(CaretEvent arg0)
	{
		System.out.println(arg0 + "");
		int x = arg0.getDot();
		int y = arg0.getMark();
		int v, b;
		if (x < y)
		{
			v = x;
			b = y;
		}
		else
		{
			v = y;
			b = x;
		}
		table = taTables.getText().substring(v, b);
		System.out.println(table);
		if (b - v > 3)
		{
			fillTheColumns();
		}
	}


	private void fillTheColumns()
	{
		try
		{
			databaseMetaData = connection.getMetaData();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		StringBuffer s = new StringBuffer("");
		try
		{
			resultSet = databaseMetaData.getColumns(null, null, table, null);
		}
		catch (SQLException e3)
		{
			e3.printStackTrace();
		}
		try
		{
			while (resultSet.next())
			{
				String str = resultSet.getString(4);
				s.append(str + "\n");
				System.out.println(str);
			}
		}
		catch (SQLException e4)
		{
			e4.printStackTrace();
			s.append("Tabellen nicht ermittelbar\n" + e4);
		}
		taColumns.setText(s.toString());
	}


	private void fillTheLayout() throws Exception
	{
		fillTheTables();
		fillTheColumns();
	//	fillTheData();
	}


	private void fillTheTables()
	{
		String dbDriver = "org.postgresql.Driver";
		String dbURL = "jdbc:postgresql://localhost:5432/jees";
		try
		{
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName(dbDriver);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			connection =
					// DriverManager.getConnection("jdbc:mysql://localhost/mildner");
					DriverManager.getConnection(dbURL, "jees", "jees");
		}
		catch (SQLException e1)
		{
			e1.printStackTrace();
		}
		try
		{
			databaseMetaData = connection.getMetaData();
		}
		catch (SQLException e2)
		{
			e2.printStackTrace();
		}
		StringBuffer s = new StringBuffer("");
		try
		{
			resultSet = databaseMetaData.getTables(null, "%", "%", null);
		}
		catch (SQLException e3)
		{
			e3.printStackTrace();
		}
		try
		{
			while (resultSet.next())
			{
				String table = resultSet.getString(3);
				s.append(table + "\n");
				System.out.println(table);
			}
		}
		catch (SQLException e4)
		{
			e4.printStackTrace();
			s.append("Tabellen nicht ermittelbar \n" + e4);
		}
		taTables.setText(s.toString());
	}


	private JPanel makeCenter()
	{
		JPanel p = new JPanelx("SQL");
		p.add(taSql);
		return p;
	}


	private JPanel makeNorth()
	{
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 3));
		JPanel p1 = new JPanelx("Tables");
		p1.add(new JScrollPane(taTables));
		JPanel p2 = new JPanelx("Columns");
		p2.add(new JScrollPane(taColumns));
		JPanel p3 = new JPanelx("Data");
		p3.add(new JScrollPane(taData));
		p.add(p1);
		p.add(p2);
		p.add(p3);
		return p;
	}


	private JPanel makeSouth()
	{
		JPanel p = new JPanel();
		p.add(run);
		p.add(quit);
		return p;
	}


	// private void fillTheData()
	// {
	// }

	private void makeTheLayout()
	{
		JPanel p = new JPanel();
		JPanel p1 = makeNorth();
		JPanel p2 = makeCenter();
		JPanel p3 = makeSouth();
		p.setLayout(new BorderLayout());
		p.add(p1, BorderLayout.NORTH);
		p.add(p2, BorderLayout.CENTER);
		p.add(p3, BorderLayout.SOUTH);
		add(p);
	}
}



class JPanelx extends JPanel
{
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	boolean test = true;


	JPanelx()
	{
		if (test)
		{
			Border border;
			border = BorderFactory.createEtchedBorder();
			setBackground(Color.green);
			setBorder(border);
		}
	}


	JPanelx(String x)
	{
		if (test)
		{
			Border border;
			border = BorderFactory.createTitledBorder(x);
			setBackground(Color.green);
			setBorder(border);
		}
	}
}
