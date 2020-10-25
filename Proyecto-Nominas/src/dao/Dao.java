package dao;

import java.sql.Connection;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.Nomina;

public interface Dao {
	
	public ArrayList<Empleado> mostrarEmpleados();
	public Connection conectar();
	Nomina mostrarSalario(String dni);

}
