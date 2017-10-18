package controlDeFlujo;

import java.util.Scanner;

public class Suma50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int suma=0, num;
        do{
        	System.out.println("Introduzca un numero");
        	num=sc.nextInt();
        	suma=suma+num;
        	}while(suma<=50);
        System.out.println("La suma total es : "+(suma-num));
        sc.close();
	}

}
