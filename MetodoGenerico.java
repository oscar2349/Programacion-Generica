package Generica;

import java.util.Arrays;

public class MetodoGenerico {

	public static void main(String[] args) {
		
		//Usando Elementos tipo String
		String Nombres[]= {"jose","Miguel","Eva",};
		System.out.println(MisMatrices.getElementos(Nombres));//imprime cantidad de elementos
		
		//usando Array del tipo Empleados
		Empleado MisEmpleados[]=new Empleado[2];
		MisEmpleados[0]=new Empleado("Jose",20,5015);
		MisEmpleados[1]=new Empleado("Maria",50,2000);
		
		System.out.println(MisMatrices.getElementos(MisEmpleados));//imprime cantidad de elementos
		
		System.out.println();
		System.out.println(MisMatrices.getMenor(Nombres));//imprime el menor de la matriz indicada
		MisMatrices.getMenor(MisEmpleados);//la clase no implementa la iterfaz comparable
	
		
		Arrays.sort(MisEmpleados);//mmm falta ver por que no imprime
		
		
	}
}

//*****************************************


class MisMatrices{
	
	//Metodo Generico
	public static <T> String getElementos(T[]a){
		return "Array Tiene "+a.length;
		}
	
		//Metodo Generico
		public static <T extends Comparable<T>>T getMenor(T[]a){
		//Como usa el metodo compareTo y la clase es estatica
		//se debe implementar la Interface Comparable	
			
			if (a==null || a.length==0 ) {//|| o	
		return null;
		}
		T elementoMenor=a[0];
		
		for (int i=1;i<a.length;i++ ) {
			
			if (elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}}
	return elementoMenor;
	}
}
	
	

