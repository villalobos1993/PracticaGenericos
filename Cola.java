package modelo;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.String;


public class Cola<T> {

	//Atributos
	
	private T [] elementos;
    private Class<?> clases ;
	
	//Constructores
	public Cola(){
	
		this.clases=getClass();
		this.elementos = (T[]) Array.newInstance(clases,0);
		
	
	}
		

	

	//Metodos

	/**
	 * Metodo Push lo utilizaremos para agrandar el Array a uno mas
	 */
	public void  push(){
	
		if(elementos==null){
			T[] aux =(T[]) Array.newInstance(clases,1);
		}else{
			T[] aux =(T[]) Array.newInstance(clases, (elementos.length+1));
			for(int i=0;i<elementos.length;i++){
				aux[i]=elementos[i];
		}		
		setElementos(aux,false,true,false);}
	}
	
	
	/**
	 * Metodo remove lo usaremos para borrar el elemento que queramos dentro del array.
	 */
	public void remove(){
		Scanner teclado= new Scanner(System.in);
		int elemento = 0;
		String auxiliar;
		boolean esCorrecto=false;
		
		T[] aux =(T[]) Array.newInstance(clases, elementos.length-1);
		
		//validacion
		do{
		esCorrecto=true;
		System.out.println("Cual elemento del array quiere borrar");
		auxiliar=teclado.nextLine();
		try{
	         elemento = Integer.parseInt(auxiliar);
		}catch(Exception e){
			
			System.out.println("Error: No ha introducido un numero");
		}
		if(elemento < 0 || elemento > elementos.length-1){
			esCorrecto=false;
			System.out.println("solo existen de 0 a " + (elementos.length-1));
		}
		
		}while(!esCorrecto);
		
		for(int i=0;i<elementos.length-1;i++){
			if(i!=elemento){
				aux[i]=elementos[i];
			}
			
		}
		
		setElementos(aux,true,false,false);
	}
	
	/**
	 * Metodo pop lo utilizaremos para borrar el ultimo elemento del array.
	 */
	
	public void pop(){
		
		T[] aux =(T[]) Array.newInstance(clases, elementos.length-1);
		
		for(int i=0;i<elementos.length-1;i++){
			
			aux[i]=elementos[i];
		}
		
		setElementos(aux,true,false,false);
		
	}
	
	/**
	 * Metodo clear lo utilizaremos para borrar todo el array completo.
	 */
	
	public void clear(){
		
		setElementos(elementos,false,false,true);
	}
	
	public boolean contains(){
		boolean esta=false;
		
		
		
		return esta;		
	}
	
	/**
	 * Metodo isEmpty lo utilizaremos para saber si el Array esta vacio
	 * 	 * @return
	 */
	public boolean isEmpty(){
		boolean vacio = false;
		for(int i=0;i<elementos.length;i++){
		if(elementos[i]==null){
			vacio=true;
			System.out.println("El Array " + i + " esta vacio.");
		}}
	
		return vacio;
	}
	
	/**
	 * Metodo size lo utilizaremos para saber cuantos elementos hay dentro de nuestro array.
	 * @return
	 */
	public int  size(){
		System.out.println(elementos.length);
		return elementos.length;
	}

	
	
 /**
  * GETTER AND SETTERS
  * @return
  */

	public T[] getElementos() {
		return elementos;
	}




	public void setElementos(T[] aux,boolean remove,boolean push,boolean clear) {
		if(remove==true && push ==false && clear ==false){
		this.elementos =(T[]) Array.newInstance(clases, elementos.length-1);

		for(int i=0;i<elementos.length;i++){
			
			elementos[i]=aux[i];
		}
		
		
		}
		
		if(remove==false && push ==true && clear ==false){
			this.elementos =(T[]) Array.newInstance(clases, aux.length);
			
			for(int i=0;i<elementos.length-1;i++){
				
				elementos[i]=aux[i];
			}
			
			
		}
		
		if(remove==false && push ==false && clear ==true){
			this.elementos =(T[]) Array.newInstance(clases, 0);}
		
	}




	public Class<?> getClases() {
		return clases;
	}




	public void setClases(Class<?> clases) {
		this.clases = getClass();
	}









	
}
