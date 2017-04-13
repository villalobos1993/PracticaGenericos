package Test;

import java.awt.Color;
import java.util.Vector;

import modelo.Cola;
public class Test {

	public static void main(String[] args) {
		
		Cola<String> c= new Cola<String>();
		
		Cola <Integer>d=new Cola<Integer>();

		System.out.println("int");
		System.out.println(d.isEmpty());
		d.size();
		d.push();
		d.size();
		d.pop();
		d.size();
		System.out.println("String");
		System.out.println(c.isEmpty());
		c.size();
		c.push();
		c.size();
		c.clear();
		c.size();
		c.contains(c);
	    
		 byte opcion=menu();
		
	}

	public static byte menu(){
		
		
		System.out.println("Que desea hacer.");
		System.out.println("1.-");
		
		
		return 0;
	}
}
