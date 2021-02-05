package hola_mundo;

import java.util.Scanner;

public class Saludo {
	
	public static void main(String []args) {
		Scanner dato = new Scanner(System.in);
		
		
		System.out.println("Hello world");
		System.out.println("Ver modificacion en bash de git");
		System.out.println("Cambio de usuario en git");

		int x,y,resultado;
		
		System.out.println("Ingrese el valor de x: ");
		x = dato.nextInt();
		
		System.out.println("Ingrese el valor de x: ");
		y = dato.nextInt();
		
		
		resultado = x+y;
	
		System.out.println("El resultado es: "+resultado);
		
		
		dato.close();
	}

}
