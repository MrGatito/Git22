package controlDeFlujo;

import java.util.Scanner;

public class AñoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mes=-1;
		String respuesta="no";

			while((mes<1) || (mes>12) ||(!respuesta.equalsIgnoreCase("si")) && (!respuesta.equalsIgnoreCase("no"))){
			try {
				System.out.println("Introduzca un mes");
				mes = sc.nextInt();
				if(mes<0 || mes>12) {
					System.out.println("EL numero no esta entre los valores pedidos : " + mes);
				}
				
			} catch (Exception e) {
				sc=new Scanner(System.in);
			System.out.println("ERROR 23400:El valor es una letra");
			}
			if(mes>0 && mes<=12) {
			try {
				sc=new Scanner(System.in);
				System.out.println("El a�o es bisiesto?");
				respuesta = sc.nextLine();
				if(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
					System.out.println("No es una respuesta de si o no ");
				}
				
			} catch (Exception e) {
				sc=new Scanner(System.in);
			System.out.println("ERROR 23400:El valor es una letra");
			}
			}
			}
			
			
	switch (mes) {
	
	case 1:
		System.out.println("31");
		break;
		
	case 2:
		if(respuesta.equalsIgnoreCase("si")) {
			System.out.println("30");
		}else
		System.out.println("28");
		break;

	case 3:
		System.out.println("31");
		break;
		
	case 4:
		System.out.println("30");
		break;
		
	case 5:
		System.out.println("31");
		break;
		
	case 6:
		System.out.println("30");
		break;
		
	case 7:
		System.out.println("31");
		break;
		
	case 8:
		System.out.println("31");
		break;
		
	case 9:
		System.out.println("30");
		break;
		
	case 10:
		System.out.println("31");
		break;
		
	case 11:
		System.out.println("30");
		break;
		
	case 12:
		System.out.println("31");
		break;
		
	}
	sc.close();
	}

}
