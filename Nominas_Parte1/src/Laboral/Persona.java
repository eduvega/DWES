package Laboral;

/**
 * The Class Persona.
 */
public class Persona {

	//Atributos:
		/** The nombre. */
		public String nombre;
		
		/** The dni. */
		public String dni;
		
		/** The sexo. */
		public char sexo;
	
			/**
			 * Instantiates a new persona.
			 *
			 * @param nombre
			 * @param dni 
			 * @param sexo 
			 * @throws DatosNoCorrectosException 
			 */
			//Constructor 1:
			public Persona(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
				
				if (sexo == 'M' || sexo == 'F') {
					
					this.sexo = sexo;
						
				}else {
					throw new DatosNoCorrectosException("Datos erroneos");
				}
				
			
				this.nombre = nombre;
				this.dni = dni;
				this.sexo = sexo;
				
			}
			
			
			/**
			 * Instantiates a new persona.
			 *
			 * @param nombre 
			 * @param sexo 
			 * @throws DatosNoCorrectosException t
			 */
			//Constructor 2:
			public Persona (String nombre, char sexo) throws DatosNoCorrectosException {
				
				if (sexo == 'M' || sexo == 'F') {
					
					this.sexo = sexo;
						
				}else {
					throw new DatosNoCorrectosException("Datos erroneos");
				}
				
				this.nombre = nombre;
				this.sexo = sexo;
			
		}
		
			
		/**
		 * Sets de dni.
		 *
		 * @param dni the new dni
		 * @throws DatosNoCorrectosException 
		 */
		//Metodos:
		public void setDni(String dni) throws DatosNoCorrectosException {
			
			if (dni.length()<9 || dni.length()>9) {
				throw new DatosNoCorrectosException("Datos erroneos (DNI)");
			} else if (dni.codePointAt(9) >65 && dni.codePointAt(9) <90  ){
				throw new DatosNoCorrectosException("Datos erroneos (DNI)");
			}else {
				this.dni = dni;
			}

				
		}
		
		/**
		 * Metodo Imprime.
		 */
		public void imprime() {
			System.out.println("Persona [nombre=" + nombre + ", dni=" + dni + "]");
			
		}
	
}
