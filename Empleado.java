package Generica;

public class Empleado implements Comparable {
	
	String nombre;
	int edad;
	double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.edad=edad;
		this.nombre=nombre;
		this.salario=salario;
		
	}

	public String datos() {
		return edad+ "  " + nombre + "  " +salario;
	}
	
	//sobreescribir el metodo de la interfaz Compareto
	//organizado por salario, se puede cambiar cualquier campo
	
	public int compareTo(Object miObjeto) {//se esta sobreescribiendo el metodo obligatorio
	
	Empleado otroEmpleado=(Empleado)miObjeto;
	if (this.salario<otroEmpleado.salario) {
		return -1;
	}
	if (this.salario>otroEmpleado.salario) {
		return 1;
	}
	return 0;
	
	
}
}