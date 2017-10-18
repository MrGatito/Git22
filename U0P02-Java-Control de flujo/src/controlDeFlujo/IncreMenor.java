package controlDeFlujo;

import java.util.Scanner;

public class IncreMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = 0, b = 0;
		try {
			System.out.println("Introduzca dos numeros entre el 1 y el 10");
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>0 && a<=10 && b>0 && b<=10) {
				int c;
				System.out.println("Introduzca un valor para incrementar el número más pequeño");
				c=sc.nextInt();
				if(a>=b) {
					b=b+c;
					System.out.println("El número menor incrementado es :"+b);
				}else
					a=a+c;
				System.out.println("El número menor incrementado es :"+a);
			}else {
				System.out.println("No se han introducido unos valores validos");
			}

		} catch (Exception e) {
			sc=new Scanner(System.in);
		System.out.println("ERROR 23400:El valor es una letra");
		}
	sc.close();
	}

}
