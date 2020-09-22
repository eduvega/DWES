package Laboral;


/**
 * The Class Nomina.
 */
public class Nomina {

	/** The Constant SUELDO_BASE. */
	private static final int SUELDO_BASE[] = {
		50000, 70000, 90000, 110000, 130000,
		150000, 170000, 190000, 210000, 230000
	};
	
	//Metodos:
	
	/*La clase es una biblioteca y tiene un método sueldo que recibe un Empleado y 
	devuelve su sueldo obtenido como resultado de evaluar la expresión: sueldo = sueldoBase + 5000*años trabajados*/
	
	/**
	 * Sueldo.
	 *
	 * @param empleado1 
	 * @return the int
	 */
	
	public int Sueldo(Empleado empleado1) {
		int sueldo;
		
		return sueldo = SUELDO_BASE[empleado1.getCategoria()-1] + (5000 * empleado1.anyos);
		
	}
}
