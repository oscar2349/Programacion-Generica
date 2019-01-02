package Generica;

public class UsoPareja {

	public static void main(String[] args) {

		
		//Manejando objetos de tipos String
		Pareja <String> una=new Pareja<String>();
		una.setPrimero("ejemplo");
		System.out.println(una.getPrimero());
		
		//Manejando objetos de tipo Persona
		Persona pers1=new Persona("Juan");
		Pareja<Persona>otra=new Pareja<Persona>();
		otra.setPrimero(pers1);
		System.out.println(otra.getPrimero());
	}
	
}


class Persona{
		
		private String Nombre;
		
		public Persona(String Nombre) {
		this.setNombre(Nombre);
		
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return Nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		
	}


