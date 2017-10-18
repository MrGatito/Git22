
package controlDeFlujo;

import java.util.Scanner;

public class DiaSemana {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	String dia;
		System.out.println("Introduzca un dia de la semana");
		dia=sc.nextLine();
switch (dia) {

case "Lunes":
	System.out.println("Laborable");
	break;
	
case "Martes":
	System.out.println("Laborable");
	break;

case "Miercoles":
	System.out.println("Laborable");
	break;
	
case "Jueves":
	System.out.println("Laborable");
	break;
	
case "Viernes":
	System.out.println("Laborable");
	break;
	
case "Sabado":
	System.out.println("No laborable");
	break;
	
case "Domingo":
	System.out.println("No laborable");
	break;
	
}
System.out.println("Estoy con mi ordenador de clase wow");
sc.close();
	}

}
