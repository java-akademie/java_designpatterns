package ch.jmildner.facade.dbdemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemo
{
	private boolean transaction = true;
	private static String dbDriver = "";
	private static String dbURL = "";
	private static Connection con = null;
	private static Statement stm = null;
	private static ResultSet rs = null;


	// private static PreparedStatement ps = null;

	public String accessOpen()
	{
		dbDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
		dbURL = "jdbc:odbc:atest";
		try
		{
			Class.forName(dbDriver);
			con = DriverManager.getConnection(dbURL);
			return "accessDB geoeffnet";
		}
		catch (ClassNotFoundException e)
		{
			return "fehler bei treiber laden\n" + e;
		}
		catch (SQLException e)
		{
			return "fehler bei connect\n" + e;
		}
	}


	public String dbClose()
	{
		if (con == null)
		{
			return "datenbank ist nicht geoeffnet";
		}
		try
		{
			con.close();
			con = null;
			return "db geschlossen";
		}
		catch (SQLException e)
		{
			return "connection kann nicht geschlossen werden\n" + e;
		}
	}


	public String dbMetadaten()
	{
		if (con == null)
		{
			return "datenbank ist nicht geoeffnet";
		}
		DatabaseMetaData metadaten = null;
		// ResultSetMetaData metares = null;
		StringBuffer s = new StringBuffer("");
		try
		{
			metadaten = con.getMetaData();
			if (metadaten == null)
			{
				return "keine Metadaten verfuegbar";
			}
			else
			{
				s.append("Metadaten \n----------------");
				s.append("\nDatabaseProductName     :\t");
				s.append(metadaten.getDatabaseProductName());
				s.append("\nDatabaseProductVersion  :\t");
				s.append(metadaten.getDatabaseProductVersion());
				s.append("\nDriverName              :\t");
				s.append(metadaten.getDriverName());
				s.append("\nsupportOrderByUnrelated :\t");
				s.append(metadaten.supportsOrderByUnrelated());
				s.append("\nNumericFunctions        :\t");
				s.append(metadaten.getNumericFunctions());
				s.append("\nsupportsTransactions    :\t");
				s.append(metadaten.supportsTransactions());
				s.append("\nStored Procedures       :\t");
				s.append(metadaten.supportsStoredProcedures());
				s.append("\nProzeduren sind         :\t");
				s.append(metadaten.getProcedureTerm());
				s.append(holeTabellen(metadaten));
				s.append("\nende der Metadaten");
				return s.toString();
			}
		}
		catch (Exception e)
		{
			return "Metadaten nicht ermittelbar\n" + e;
		}
	}


	public String dbOpen(String dbase)
	{
		if (con != null)
		{
			return "datenbank ist schon geoeffnet";
		}
		if (dbase == "access")
		{
			return accessOpen();
		}
		if (dbase == "mysql")
		{
			return mysqlOpen();
		}
		if (dbase == "postgres")
		{
			return postgresOpen();
		}
		return "keine datenbank geoeffnet";
	}


	private String holeTabellen(DatabaseMetaData metadaten)
	{
		StringBuffer s = new StringBuffer("\n\nTabellen in Datenbank");
		try
		{
			ResultSet rs = metadaten.getTables(null, "%", "%", null);
			while (rs.next())
			{
				String table = rs.getString(3);
				s.append("\n\t" + table);
				System.out.println(table);
			}
		}
		catch (Exception e)
		{
			s.append("\n\tTabellen nicht ermittelbar \n" + e);
		}
		s.append("\n");
		return s.toString();
	}


	public String kCreate()
	{
		if (con == null)
		{
			return "datenbank ist nicht geoeffnet";
		}
		try
		{
			startTransaction();
			stm = con.createStatement();
			stm.executeUpdate("CREATE TABLE kunde "
					+ "(name 	CHAR(20)  " + ",nummer 	INT NOT NULL"
					+ ",PRIMARY KEY (nummer)" + ");");
			stm.close();
			stoppTransaction();
			return "create kunde ok";
		}
		catch (SQLException e)
		{
			return "fehler bei create kunde" + e;
		}
	}


	public String kDelete()
	{
		if (con == null)
		{
			return "datenbank ist nicht geoeffnet";
		}
		try
		{
			startTransaction();
			stm = con.createStatement();
			stm.executeUpdate("DELETE FROM kunde WHERE name='xxxx'");
			stm.close();
			stoppTransaction();
			return "delete kunde OK";
		}
		catch (SQLException e)
		{
			return "fehler bei delete kunde\n" + e;
		}
	}


	public String kDrop()
	{
		if (con == null)
		{
			return "datenbank ist nicht geoeffnet";
		}
		try
		{
			startTransaction();
			stm = con.createStatement();
			stm.executeUpdate("DROP TABLE kunde ");
			stm.close();
			stoppTransaction();
			return "drop kunde ok";
		}
		catch (SQLException e)
		{
			return "fehler bei drop kunde: " + e;
		}
	}


	public String kInsert(int max)
	{
		System.out.println("anfang insert");
		if (con == null)
		{
			return "datenbank ist nicht geoeffnet";
		}
		try
		{
			startTransaction();
			stm = con.createStatement();
			String name;
			int nummer;
			for (int i = 1; i <= max; i++)
			{
				if (i % 1000 == 0)
					System.out.println(i);
				name = "name" + i;
				nummer = i;
				String iKunde = "INSERT INTO kunde VALUES (?,?)";
				PreparedStatement ps = con.prepareStatement(iKunde);
				ps.setString(1, name);
				ps.setInt(2, nummer);
				ps.execute();
				ps.setString(1, "xxxx");
				ps.setInt(2, nummer + 1000);
				ps.execute();
			}
			stm.close();
			stoppTransaction();
			System.out.println("ende insert");
			return "insert kunde OK";
		}
		catch (SQLException e)
		{
			return "fehler bei insert kunde\n" + e;
		}
	}


	public String kSelect()
	{
		if (con == null)
		{
			return "datenbank ist nicht geoeffnet";
		}
		try
		{
			stm = con.createStatement();
			rs = stm.executeQuery("SELECT name,nummer FROM kunde ORDER BY kunde.nummer");
			String s3 = "";
			while (rs.next())
			{
				String s1 = rs.getString(1);
				String s2 = rs.getString(2);
				s3 = s3 + s1 + "\t" + s2 + "\n";
				System.out.println(s1);
				System.out.print(s2);
			}
			stm.close();
			return s3;
		}
		catch (SQLException e)
		{
			return "" + "fehler bei anzeigenKunden\n" + e
					+ "\ndatenbank ist eventuell nicht geoeffnet"
					+ "\noder tabelle 'kunde' nicht vorhanden";
		}
	}


	public String mysqlOpen()
	{
		dbDriver = "com.mysql.jdbc.Driver";
		dbURL = "jdbc:mysql://localhost/mildner";
		dbDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
		dbURL = "jdbc:odbc:mtest";
		try
		{
			Class.forName(dbDriver);
			con = DriverManager.getConnection(dbURL);
			return "mysqlDB geoeffnet";
		}
		catch (ClassNotFoundException e)
		{
			return "fehler bei treiber laden\n" + e;
		}
		catch (SQLException e)
		{
			return "fehler bei connect\n" + e;
		}
	}


	public String postgresOpen()
	{
		dbDriver = "org.postgresql.Driver";
		dbURL = "jdbc:postgresql:postgres";
		try
		{
			Class.forName(dbDriver);
			con = DriverManager.getConnection(dbURL, "postgres", "");
			return "postgresDB geoeffnet";
		}
		catch (ClassNotFoundException e)
		{
			return "fehler bei treiber laden\n" + e;
		}
		catch (SQLException e)
		{
			return "fehler bei connect\n" + e;
		}
	}


	private void startTransaction()
	{
		if (!transaction)
		{
			return;
		}
		try
		{
			con.setAutoCommit(true);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}


	private void stoppTransaction()
	{
		if (!transaction)
		{
			return;
		}
		try
		{
			con.commit();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
