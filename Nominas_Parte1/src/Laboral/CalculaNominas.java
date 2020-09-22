package Laboral;

import java.util.Scanner;


/**
 * The Class CalculaNominas.
 */
public class CalculaNominas {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws DatosNoCorrectosException 
	 */
	public static void main(String[] args) throws DatosNoCorrectosException {
		boolean exception = true;
		
		//Crear empleados:
		Empleado empleado1 = new Empleado("James Cosling", "32000032G", 'M', 9, 5);
		Empleado empleado2 = new Empleado("Ada Lovelace", "32000031R,", 'F', 1, 5); //si le pongo 0 me sale un error(solucion porque es -1 en la cuenta de la nomina)
		
		//trycatch para controlar la excepcion de categoria:
			try {
				empleado1.setCategoria(5);
			} catch (DatosNoCorrectosException e) {
				e.printStackTrace();//Es una herramienta muy simple, pero muy útil para diagnosticar una excepción. Te dice qué sucedió y en qué parte del código sucedió esto.
			}
		
	
		//metodo que muestra los datos de los empleados:
		escribe(empleado1, empleado2);
	
		
		
	}
	
	//Metodos:
	/**
	 * Escribe.
	 *
	 * @param empleado1 
	 * @param empleado2 
	 */
	/*
	 * recibe los valores de los dos empleados e imprima sus atributos y el sueldo que cada uno gana.
	 */
	private static void escribe(Empleado empleado1, Empleado empleado2) {
		
		//Objetos de la clase nomina
		Nomina nomina1 = new Nomina();
		Nomina nomina2 = new Nomina();
		
		empleado1.imprime();//llamamos al metodo imprime de la clase empleado para los atributos de este.
		System.out.println(nomina1.Sueldo(empleado1));//imprimimos la llamada al objeto nomina1 y dentro llamamos el sueldo, para luego pasarle el objeto empleado y asi calcularnos el sueldo
		
		empleado2.imprime();
		System.out.println(nomina2.Sueldo(empleado2));
	}
	
}
