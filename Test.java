package Test;

import java.awt.Color;
import java.util.Scanner;
import java.util.Vector;

import modelo.Cola;
import modelo.Gato;
public class Test {

	
	public static void main(String[] args) {
		boolean salir=false;
		boolean vacio;	
		boolean existe;
		Cola<Gato> Cola=new Cola<Gato>();
		Gato g1=new Gato("Felix","siames");
		Gato g2=new Gato("gatito","1");
		Gato g3=new Gato("felino","2");
		Gato g4=new Gato("negrito","3");
		Gato g5=new Gato("doraemon","4");
		
		 byte opcion=0;
		do{ 
			 opcion = menu();
			if (opcion == 1) {
			    Cola.push(g1);
			    Cola.push(g2);
			    Cola.push(g3);
			    Cola.push(g4);
			    Cola.push(g5);
			}
			if (opcion == 2) {
				Cola.remove();
			}
			if (opcion == 3) {
				
				Cola.pop();
			}
			if (opcion == 4) {
				Cola.clear(); 
			}
			if (opcion == 5) {
				vacio=Cola.isEmpty();
				System.out.println(vacio);
			}
			if (opcion == 6) {
				Cola.size();
			}
			if(opcion == 7){
				existe=Cola.contains(g1);
				System.out.println(existe);
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
