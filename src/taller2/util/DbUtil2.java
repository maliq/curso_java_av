package taller2.util;

import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import taller2.act1.PropiedadUtil;

public class DbUtil2 {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/";

	PropiedadUtil propiedadUtil;

	public DbUtil2() {
		propiedadUtil = new PropiedadUtil();
	}

	public Connection getConnection() {
		URL dbUrl = this.getClass().getResource("db.txt");
		Map<String, String> map = null;
		try {
			map = PropiedadUtil.getPropiedades(dbUrl.toURI());
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String user = map.get("usuario");
		String pass = map.get("clave");
		String dbName = map.get("db");
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		try {
			conn = java.sql.DriverManager.getConnection(DB_URL+dbName, user, pass);
			conn.setAutoCommit(false);
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) throws SQLException {
		Connection connection = new DbUtil2().getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Usuario");
		while(rs.next()){
			StringBuffer buffer= new StringBuffer();
			buffer.append(rs.getString(1));
			buffer.append("\t");
			buffer.append(rs.getString(2));
			buffer.append("\t");
			buffer.append(rs.getInt(3));
			System.out.println(buffer);
		}
	}

}
