package controlDeFlujo;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int opcion=0, opc=0;
		do{
			try {
				System.out.println("Menú de una compañía telefónica");
				System.out.println("1: Consultar estado");
				System.out.println("2: Atención al cliente");
				System.out.println("3: Cambiar compañía");
				System.out.println("4: Salir");
				opcion=sc.nextInt();
			} catch (Exception e) {
				sc=new Scanner(System.in);
			System.out.println("ERROR 23400:El valor es una letra");
			}
		
switch (opcion) {

case 1:
	do {
	try {
		System.out.println("Menú de Consultar estado");
		System.out.println("1: Consultar Saldo");
		System.out.println("2: Ver tarifa");
		System.out.println("3: Volver");
		opc=sc.nextInt();
	} catch (Exception e) {
		sc=new Scanner(System.in);
	System.out.println("ERROR 23400:El valor es una letra");
	}
	switch(opc) {
	case 1:
		System.out.println("El saldo es de 10€");
		break;
	case 2:
		System.out.println("Su tarifa es la TarifusLel, que cuenta con 2GB y llamadas ilimitadas");
		break;
	}
	
	}while(opc!=3);
	break;
case 2:
	do {
		try {
			System.out.println("Qué desea consultar?");
			System.out.println("1: No tengo dinero");
			System.out.println("2: Problemas con la red");
			System.out.println("3: Volver");
			opc=sc.nextInt();
		} catch (Exception e) {
			sc=new Scanner(System.in);
		System.out.println("ERROR 23400:El valor es una letra");
		}
		switch(opc) {
		case 1:
			System.out.println("Pues trabaja");
			break;
		case 2:
			System.out.println("LLame al 692234 para más información");
			break;
		}
		
		}while(opc!=3);
		break;

case 3:
	do {
		try {
			System.out.println("Desea cambiar de compañía?");
			System.out.println("1: Sí, a una más cara");
			System.out.println("2: Volver");
			opc=sc.nextInt();
		} catch (Exception e) {
			sc=new Scanner(System.in);
		System.out.println("ERROR 23400:El valor es una letra");
		}
		switch(opc) {
		case 1:
			System.out.println("Ahora su tarifa cuesta 100€, Gracias por confiar en nosotros");
			break;
		}
		
		}while(opc!=2);
		break;
	
}
	
	}while(opcion!=4);
		sc.close();
}
}
