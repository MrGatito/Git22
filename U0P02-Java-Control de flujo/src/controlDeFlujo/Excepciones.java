package controlDeFlujo;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=-1;
		while((num<0) || (num>10)) 
		{
			try {
				System.out.println("Introduzca un numero del 1 al 10");
				num = sc.nextInt();
				if(num<0 || num>10) {
					System.out.println("EL numero no esta entre los valores pedidos : " + num);
				}
				
			} catch (Exception e) {
				sc=new Scanner(System.in);
			System.out.println("ERROR 23400:El valor es una letra");
			}
		}
		sc.close();
	}

}
