package controlDeFlujo;

import java.util.Scanner;

public class Supercadena {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena, superc="";
	for(int i=0;i<5;i++) {
		System.out.println("Introduzca una cadena");
		cadena=sc.nextLine();
		superc=superc.concat(cadena);
	}
	System.out.println("la supercadena es : "+superc);
	sc.close();

	}

}
