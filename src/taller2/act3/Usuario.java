package taller2.act3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import taller2.util.DbUtil;

public class Usuario {
	Connection connection;

	public Usuario() throws SQLException {
		connection = DbUtil.getConnection();
	}
	
	public boolean crear(String alias, String nombre, int edad){
		String sql = "Insert into Usuario (alias, nombre, edad) values(?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, alias);
			stmt.setString(2, nombre);
			stmt.setInt(3, edad);
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean modificar(String alias, String nombre, int edad){
		String sql = "select * from Usuario";
		PreparedStatement stmt;
		boolean flag = false;
		try {
			stmt = connection.prepareStatement(sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs= stmt.executeQuery();
			while(rs.next()){
				if(rs.getString(1).equals(alias)){
					rs.updateString("nombre", nombre);
					rs.updateInt("edad",edad);
					rs.updateRow();
					flag = true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	public static void main(String[] args) throws SQLException {
		Usuario usuario= new Usuario();
//		usuario.crear("alias1", "nombre1", 20);
		boolean fueModificado = usuario.modificar("alias1", "nombre2", 30);
		System.out.println("Fue modificado:"+ fueModificado);
	}

}
