package Generica;

//Creacion de clase generica

public class Pareja <T>{//tipo generico T(T,U,K por convencion)

	private T primero;//variable de clase
	
	
	public Pareja(){//Contructor de la clase	
		primero=null;
		
	}
public void setPrimero(T nuevo_valor) {
	primero = nuevo_valor;
}

public T getPrimero() {//metodo get
	return primero;
}

	
}
