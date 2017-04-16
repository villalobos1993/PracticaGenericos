package modelo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;


public class Cola<T> {

	// Atributos

	private T[] elementos;
	private int longitud;

	// Constructores
	public Cola() {

		this.elementos = (T[]) new Object[0];

	}

	// Metodos

	/**
	 * Metodo Push lo utilizaremos para agrandar el Array a uno mas
	 */
	public void push(T element) {

		// si es nulo añadiremos 1 elemento al array
		if (elementos == null) {

			T[] aux = (T[]) new Object[1];
		} else {
			// si no aumentaremos el array
			T[] aux = (T[]) new Object[elementos.length + 1];
			for (int i = 0; i < elementos.length; i++) {
				aux[i] = elementos[i];
			}
			setElementos(aux, false, true, false);
		}
	}

	/**
	 * Metodo remove lo usaremos para borrar el elemento que queramos dentro del
	 * array.
	 */
	public void remove() {
		// si esta vacio saltara que tiene que introducir objetos
		if (elementos.length == 0) {
			System.out.println("Esta vacio inserte objetos.");

		} else {

			Scanner teclado = new Scanner(System.in);
			int elemento = 0;
			String auxiliar;
			boolean esCorrecto = false;

			T[] aux = (T[]) new Object[elementos.length];

			// validacion
			do {
				esCorrecto = true;
				System.out.println("Cual elemento del array quiere borrar");
				auxiliar = teclado.nextLine();
				try {
					elemento = Integer.parseInt(auxiliar);
				} catch (Exception e) {

					System.out.println("Error: No ha introducido un numero");
				}
				if (elemento < 0 || elemento > elementos.length - 1) {
					esCorrecto = false;
					System.out.println("solo existen de 0 a " + (elementos.length - 1));
				}

			} while (!esCorrecto);

			// En este for copiaremos el array de elementos
			for (int i = 0; i < elementos.length; i++) {
				// los que sean diferentes al numero elegido es decir se copiara
				// siempre 1 menos
				if (i != elemento) {
					aux[i] = elementos[i];
				}
			}

			setElementos(aux, true, false, false);
		}
	}

	/**
	 * Metodo pop lo utilizaremos para borrar el ultimo elemento del array.
	 */

	public void pop() {
		// si esta vacio saltara que tiene que introducir objetos
		if (elementos.length == 0) {
			System.out.println("Esta vacio inserte objetos.");

		} else {
			byte eleccion = 0;
			String auxiliar="";
			boolean esCorrecto=false;
			Scanner teclado = new Scanner(System.in);
			do{
			System.out.println("Que desea hacer Lifo o Fifo");
			System.out.println("1.Lifo");
			System.out.println("2.Fifo");
			auxiliar=teclado.nextLine();
			try{
				eleccion=Byte.parseByte(auxiliar);
			
			}catch(Exception e){
				System.out.println("ERROR:No has introducido un numero");
			}
		    if(eleccion<1||eleccion>2){
		    	esCorrecto=false;
		    	System.out.println("El menu esta desde el 1 al 2");
		    }
			}while(!esCorrecto);
			
			T[] aux = (T[]) new Object[elementos.length];
			if(eleccion ==1){
			

			for (int i = 0; i < elementos.length - 1; i++) {

				aux[i] = elementos[i];
			}
			}
			if(eleccion == 2){
				
				for (int i = 1; i < elementos.length; i++) {

					aux[i] = elementos[i];
				}
				
			}

			setElementos(aux, true, false, false);
		}

	}

	/**
	 * Metodo clear lo utilizaremos para borrar todo el array completo.
	 */

	public void clear() {
		// si esta vacio saltara que tiene que introducir objetos
		if (elementos.length == 0) {
			System.out.println("Esta vacio inserte objetos.");

		} else {

			setElementos(elementos, false, false, true);
		}
	}

	/**
	 * Metodo Contains para ver si contiene un elemento en el array
	 */
	//No funciona
	public boolean contains(T element) {
		boolean existe = false;
		if (elementos.length == 0) {
			System.out.println("Esta vacio inserte objetos.");

		} else {

			for (int i = 0; i < elementos.length; i++) {
				if (elementos[i].equals(element)) {
					existe = true;
				}
			}
		}
		return existe;
	}

	/**
	 * Metodo isEmpty lo utilizaremos para saber si el Array esta vacio
	 * * @return
	 */
	public boolean isEmpty() {
		boolean vacio = false;
		if (elementos.length == 0) {
			vacio = true;
			System.out.println("Esta vacio.");

		}

		return vacio;
	}

	/**
	 * Metodo size lo utilizaremos para saber cuantos elementos hay dentro de
	 * nuestro array.
	 * 
	 * @return
	 */
	public int size() {
		System.out.println(elementos.length);
		return elementos.length;
	}

	/**
	 * GETTER AND SETTERS
	 * 
	 * @return
	 */

	public T[] getElementos() {
		return elementos;
	}

	//SetElementos
	public void setElementos(T[] aux, boolean remove, boolean push, boolean clear) {
		//Funcionara para remove y pop
		if (remove == true && push == false && clear == false) {
			this.elementos = (T[]) new Object[aux.length - 1];

			for (int i = 0; i < elementos.length; i++) {

				elementos[i] = aux[i];
			}

		}
		//Funcionara para Push
		if (remove == false && push == true && clear == false) {
			this.elementos = (T[]) new Object[aux.length];

			for (int i = 0; i < elementos.length - 1; i++) {

				elementos[i] = aux[i];
			}

		}
		//Funcionara para clear
		if (remove == false && push == false && clear == true) {
			this.elementos = (T[]) new Object[0];
		}

	}

}
