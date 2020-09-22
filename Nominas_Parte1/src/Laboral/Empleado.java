package Laboral;

/**
 * The Class Empleado.
 */
public class Empleado extends Persona {
	
	
	/** The categoria. */
	//Atributos:
	private int categoria = 1;
	
	/** The anyos. */
	public int anyos = 0;


	/**
	 * Instantiates a new empleado.
	 *
	 * @param nombre 
	 * @param dni 
	 * @param sexo
	 * @param categoria 
	 * @param anyos 
	 * @throws DatosNoCorrectosException 
	 */
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		
			if (anyos < 0) {
				throw new DatosNoCorrectosException("Datos erroneos(anyos)");
			}else {
				this.anyos = anyos;
			}
		
		this.categoria=categoria;
		this.anyos=anyos;
	}
	
	/**
	 * Instantiates a new empleado.
	 *
	 * @param nombre 
	 * @param dni 
	 * @param sexo 
	 * @throws DatosNoCorrectosException 
	 */
	public Empleado(String nombre, String dni, char sexo) throws DatosNoCorrectosException { 
		super(nombre, dni, sexo);
		
	}

	
	//Metodos: 
	/**
	 * Gets the categoria.
	 *
	 * @return the categoria
	 */
	//getCategoria que devuelve el valor del atributo categoria.
	public int getCategoria() {
		return categoria;
	}
	
	/**
	 * Sets the categoria.
	 *
	 * @param categoria the new categoria
	 * @throws DatosNoCorrectosException the datos no correctos exception
	 */
	//setCategoria que sirve para cambiar de categoría de un empleado, que recibe como parámetro de entrada.
	public void setCategoria(int categoria) throws DatosNoCorrectosException{
		
		if (categoria <1 || categoria > 10) {
			throw new DatosNoCorrectosException("Datos erroneos");
		}else {
			this.categoria = categoria;
		}
		
	}
	
	
	//Get y Set anyos:
	
	/**
	 * Gets the anyos.
	 *
	 * @return the anyos
	 */
	public int getAnyos() {
		return anyos;
	}

	/**
	 * Sets the anyos.
	 *
	 * @param anyos the new anyos
	 */
	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

	/**
	 * Incr anyo.
	 *
	 * @param anyos the anyos
	 */
	//incrAnyo que incrementa en uno el número de años trabajados.
	public void incrAnyo(int anyos) {
		
		this.anyos++;
		
	}
	
	/**
	 * Imprime.
	 */
	//imprime que presenta todos los datos del empleado.
	public void imprime() {
		
		System.out.println("Empleado [categoria=" + categoria + ", anyos=" + anyos + ", nombre=" + nombre + ", dni=" + dni
				+ ", sexo=" + sexo + "]");
	}

	
	
	
}
//