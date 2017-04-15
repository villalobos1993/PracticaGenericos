package Test;

import java.awt.Color;
import java.util.Scanner;
import java.util.Vector;

import modelo.Cola;
public class Test {
public static Cola c;
	
	public static void main(String[] args) {
		boolean salir=false;
		
		c=new Cola<String>();
		Cola<String> s=new Cola<String>();
		 byte opcion=0;
		do{ 
			 opcion = menu();
			if (opcion == 1) {
			    c.push();
			}
			if (opcion == 2) {
               c.remove();
			}
			if (opcion == 3) {
               c.pop();
			}
			if (opcion == 4) {
                c.clear(); 
			}
			if (opcion == 5) {
                c.isEmpty();
			}
			if (opcion == 6) {
                 c.size();
			}
			if(opcion == 7){
				 c.contains();
			 }
			if(opcion==8){
				salir=true;
			}

	 
		}while(!salir);
	}

	public static byte menu(){
		
		byte eleccion = 0;
		String aux;
		boolean esCorrecto=false;
		Scanner teclado= new Scanner(System.in);
		
		do{
		esCorrecto=true;
		System.out.println("Que desea hacer.");
		System.out.println("1.-Añadir un elemento al Array (Push)");
	    System.out.println("2.-Borrar un elemento que elijas (Remove)");
	    System.out.println("3.-Borrar el ultimo elemento del Array(Pop)");
	    System.out.println("4.-Limpiar el Array (Clear)");
	    System.out.println("5.-Ver estado del Array (Empty)");
	    System.out.println("6.-Ver tamaño del Array (Size)");
	    System.out.println("7.-Ver si un elemento esta en el Array (Contains)");
	    System.out.println("8.-Salir.");
	    aux=teclado.nextLine();
	    try{
	    		 eleccion=Byte.parseByte(aux);   
			
		}catch(Exception e){
			System.out.println("ERROR:No has introducido un numero");
		}
	    if(eleccion<1||eleccion>8){
	    	esCorrecto=false;
	    	System.out.println("El menu esta desde el 1 al 8");
	    }
		}while(!esCorrecto);
		return eleccion;
	}
}
