package taller2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test";

	// Database credentials
	static final String USER = "taller2";
	static final String PASS = "taller2";

	public DbUtil() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		try {
			conn = java.sql.DriverManager.getConnection(DB_URL, USER, PASS);
			//conn.setAutoCommit(false);
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void crearTablaUsuario() throws SQLException{
		Connection connection = DbUtil.getConnection();
		Statement stmt = connection.createStatement();
		String sql = "CREATE TABLE Usuario " +
                "(alias VARCHAR(255), " + 
                " nombre VARCHAR(255), " + 
                " edad INTEGER, " + 
                " PRIMARY KEY ( alias ))"; 
		stmt.executeUpdate(sql);
	}
	
	public static void main(String[] args) throws SQLException {
//		DbUtil.crearTablaUsuario();
		Connection connection = DbUtil.getConnection();
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
