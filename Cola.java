package modelo;

import java.lang.reflect.Array;

import org.omg.Messaging.SyncScopeHelper;

public class Cola<T> {

	//Atributos
	
	private T [] elementos;
    private Class<?> clases ;
	
	//Constructores
	public Cola(){
	
		this.clases=getClass();
		this.elementos = (T[]) Array.newInstance(clases, 5);
		
	
	}
		

	

	//Metodos
	public void  push(){
	
		T[] aux =(T[]) Array.newInstance(clases, elementos.length+1);
		
		for(int i=0;i<elementos.length;i++){
			aux[i]=elementos[i];
		}
		
		setElementos(aux,false,true,false);
	}
	
	public void remove(){
		
		T[] aux =(T[]) Array.newInstance(clases, elementos.length-1);
		
		
		setElementos(aux,true,false,false);
	}
	
	public void pop(){
		
		T[] aux =(T[]) Array.newInstance(clases, elementos.length-1);
		
		for(int i=0;i<elementos.length-1;i++){
			
			aux[i]=elementos[i];
		}
		
		setElementos(aux,true,false,false);
		
	}
	
	public void clear(){
		
		setElementos(elementos,false,false,true);
	}
	
	public boolean contains(){
		boolean esta=false;
		
		
		
		return esta;		
	}
	
	public boolean isEmpty(){
		boolean hola = false;
		for(int i=0;i<elementos.length;i++){
		if(elementos[i]==null){
			hola=true;
			System.out.println("El Array esta vacio.");
		}}
	
		return hola;
	}
	
	public int size(){
		System.out.println(elementos.length);
		return 0;
	}


//getter and setter

	public T[] getElementos() {
		return elementos;
	}




	public void setElementos(T[] elementos,boolean remove,boolean push,boolean clear) {
		if(remove==false && push ==true && clear ==false){
		this.elementos =(T[]) Array.newInstance(clases, elementos.length);}
		
		if(remove==true && push ==false && clear ==false){
			this.elementos =(T[]) Array.newInstance(clases, elementos.length);}
		
		if(remove==false && push ==false && clear ==true){
			this.elementos =(T[]) Array.newInstance(clases, 0);}
		
	}




	public Class<?> getClases() {
		return clases;
	}




	public void setClases(Class<?> clases) {
		this.clases = clases;
	}




	
}
