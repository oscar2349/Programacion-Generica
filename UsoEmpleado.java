package Generica;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class UsoEmpleado {

	public static void main(String[] args) {
		// crear matriz
		Empleado [] lista=new Empleado[3];
		
		//elementos
		
		lista[0] = new Empleado("Juan",30,2500);
		lista[1] = new Empleado("Migel",35,2000);
		lista[2] = new Empleado("Laura",20,2000);
		
		for (Empleado empleado : lista) {
			System.out.println(empleado.datos());		
		}
		System.out.println();// dejasr espacio entre matrices
		
//Con Array list*******************************************
		
		
		// crear matriz
		
	ArrayList <Empleado>Matriz2=new ArrayList<Empleado>();
	
	
	//elementos
	Matriz2.add(new Empleado("Tatiana",20,3000));
	Matriz2.add(new Empleado("Laura",20,3000));
	Matriz2.add(new Empleado(JOptionPane.showInputDialog("Ingrese nombre"),20,3000));
	Matriz2.add(lista[2]);// agrego elemento existente
	
	Matriz2.trimToSize();// recorta memoria
		
		for (Empleado empleado : Matriz2) {
			System.out.println(empleado.datos());
			
		}
		// Si quiero un elemento especifico del Array
				System.out.println();
				System.out.println(Matriz2.get(1).datos());
				System.out.println();
				//System.out.println(Matriz2.isEmpty());
				
//**********ITERADORES*************************************	
				
System.out.println();//Espacio

Iterator<Empleado>Iterador=Matriz2.iterator();
//System.out.println(Iterador.next().datos());

while (Iterador.hasNext()) {
	//Empleado empleado = (Empleado) Iterador.next();
	//System.out.println(empleado.datos());
	System.out.println(Iterador.next().datos());
	//Imprimir usadno el iterador, pero se vuelven String
	//System.out.println(Iterador.next().toString());
	
}


	}

}
