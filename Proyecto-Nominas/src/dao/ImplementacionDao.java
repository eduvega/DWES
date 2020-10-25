package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.Nomina;

public class ImplementacionDao implements Dao{
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/laboral";
	static final String DB_USER = "root";
	static final String DB_PASS = "";
	
	@Override
	public Connection conectar() {
		Connection conexion = null;
		
		 try{
			  Class.forName(JDBC_DRIVER);
			  conexion = DriverManager.getConnection(DB_URL, DB_USER , DB_PASS);
			  System.out.println("...Te conectaste con exito a la BBDD...");
			     
		  }catch (Exception e){
			  e.printStackTrace();
			  System.out.println("No se ha podido conectar");
		  }
		
		return conexion;
	}

	@Override
	public ArrayList<Empleado> mostrarEmpleados() {
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		try {
			Connection conexion = conectar();
			Statement s = conexion.createStatement();
			ResultSet rs;
			rs  = s.executeQuery ("SELECT * FROM empleados");
			
			while(rs.next()) {
				Empleado empleado = new Empleado(rs.getString(1), rs.getString(2), rs.getString(3).charAt(0), rs.getInt(4), rs.getInt(5));
				
				empleados.add(empleado);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		return empleados;
		
		
	}

	@Override
	public Nomina mostrarSalario(String dni) {
		Nomina nom = null;
		
		try {
				Connection conexion = conectar();
				Statement s = conexion.createStatement();
				ResultSet rs;
				rs = s.executeQuery("SELECT * FROM nomina WHERE dni= '" + dni + "'");
				while (rs.next()) {
					nom = new Nomina();
					
				}
				conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		} 
		return nom;
		
	}

	

}
