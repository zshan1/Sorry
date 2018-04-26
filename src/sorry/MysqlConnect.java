package sorry;
import java.io.*;
import java.sql.*;
import java.util.ResourceBundle;

//############################################################################
//
// this class makes the connection to the mySQL database.
//
// used by all other classes
//
//############################################################################
public class MysqlConnect {
	public static Connection myConnect() {
		// System.out.println("MySQL Connect Example.");
		Connection conn = null;

		String url = "jdbc:mysql://webdb.uvm.edu/";
		String dbName = "MANDER34_sorry";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "mander34_admin";
		String password = "1ulFlZmvPnK3CMFJ";

		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
		} catch (Exception e) {
			System.err.println("Error MysqlConnect.myConnect: " + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}
}
