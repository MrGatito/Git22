package controlDeFlujo;

import java.util.Scanner;

public class Factorial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		while(a<1) {
		try {
			System.out.println("Introduzca un numero entero para calcular su factorial");
			a = sc.nextInt();
		} catch (Exception e) {
			sc=new Scanner(System.in);
		System.out.println("ERROR 23400:El valor es una letra");
		}
		}
		factDoWhile(a);
		factWhile(a);
		factFor(a);
	}
	public static void factDoWhile(int a) {
		int cont=0, fact=1;
		do{
			cont++;
			fact=fact*cont;
		}while(cont<a);
		System.out.println("El factorial de "+a+" es : "+fact);
	}
	public static void factWhile(int a) {
		int cont=0, fact=1;
		while(cont<a) {
			cont++;
			fact=fact*cont;
		}
		System.out.println("El factorial de "+a+" es : "+fact);
	}
	public static void factFor(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("El factorial de "+a+" es : "+fact);
	}
	

}
