

###### *Desarrollo Web en Entorno Servidor - Curso 2017/2018 - IES Leonardo Da Vinci - Alberto Ruiz*

## U0P02 - Repaso: estructuras de control de flujo
#### Entrega de: *Eduardo Garcés Ortega*
----
#### 1. Descripción:

Vamos a instalar el Java Develompent Kit (JDK) y el entorno de desarrollo Eclipse. A continuación crearemos un proyecto Java en el que practicaremos las estructuras de control de flujo (tanto de selección como de iteración) a través de diferentes programas.

#### 2. Formato de entrega:

Completa este documento incluyendo tras cada apartado el código necesario para resolver el problema (sin incluir el método `main`, sólo el código correspondiente a la solución) y el resultado de una ejecución.

* Para el código utiliza bloques de código Markdown
* Para el resultado puedes utilizar también bloques, o bien incluir capturas de pantalla de Eclipse

#### 3. Trabajo a realizar:

Antes de comenzar, escribe tu / vuestros nombres en la cabecera de este documento

##### Parte 1: Configuración del espacio de trabajo en la máquina virtual de Windows 

1. Desinstala la versión actual de Java. Recuerda que normalmente cuando decimos que un ordenador "tiene instalado Java" lo que en realidad tiene instalado es el Java Runtime Environment (JRE).
2. Descarga la última versión del [Java Development Kit (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html): Java 8 Update 144. Localiza la descarga en la web oficial, pero si lo deseas puedes descargar el archivo desde el FTP del instituto. **Utilizaremos esta versión de Java durante todo el curso. Es muy importante que tengas la misma en casa y no la actualices para evitar problemas al compartir proyectos posteriormente**.
3. Desde el menú de inicio, abre el panel de configuración de Java (`Configurar Java`). Recuerda: hablamos del JRE. El JDK no tiene ninguna aplicación gráfica
4. Comprueba que la versión es la esperada haciendo clic en el botón `Acerca de` en la pestaña `General`
5. En la pestaña `Actualizar` desmarca la casilla *Comprobar actualizaciones automáticamente*. Esto garantizará que todos tengamos la misma versión de Java a lo largo del curso.
6. Descarga la última versión de Eclipse, llamada Oxygen. Como más adelante desarrollaremos aplicaciones Java EE, no queremos el paquete básico de instalación: en la [web de descargas de Eclipse](http://www.eclipse.org/downloads/) debes hacer clic en *Download Packages* y escoger la edición para desarrolladores Java EE. Tienes el archivo disponible en el servidor FTP del instituto.
7. Descomprime el archivo de forma que la carpeta llamada `eclipse` (sin la versión) quede donde desees, por ejemplo en la raíz `C:\`
8. Crea un acceso directo al ejecutable de Eclipse en el escritorio y/o en la barra de tareas
9. Ejecuta Eclipse: la primera decisión será la ubicación de la carpeta de espacio de trabajo o *workspace*: puedes dejar la que viene por defecto o escoger otra a tu gusto
10. Inicialmente aparecerá la pantalla de bienvenida: desmarca la casilla para que no vuelva a aparecer en el futuro

#####Parte 2: Creación y organización de un proyecto

1. Crea un nuevo proyecto Java: `File` → `New` → `Project` → `Java Project`. El nombre es importante, puesto que seguiremos la misma nomenclatura durante todo el curso: *Número de práctica - Lenguaje utilizado - Título o descripción*, en este caso: *U0P02-Java-Control de flujo* 


1. Crea desde Eclipse una carpeta `doc` en la raíz del proyecto (junto a la carpeta `src`) y copia en ella el archivo de este enunciado (arrastra el archivo a la carpeta de Eclipse). A lo largo del curso seguiremos este esquema para agrupar cada proyecto con su correspondiente enunciado.
2. Indica que queremos editar los archivos Markdown con Typora: *clic secundario sobre el archivo → Open with → Other → Browse → Localizar el ejecutable de Typora en la carpeta de archivos de programa*. No olvides marcar la casilla para indicar que queremos utilizar este programa para abrir todos los archivos Markdown
3. Comprueba que al hacer doble clic sobre un archivo Markdown en Eclipse, se abre con Typora
4. Crea una clase *HolaMundo* con un código sencillo para probar que tu instalación de Java es correcta y puedes compilar y ejecutar programas en Java. 
5. Recuerda que dispones de plantillas de código para escribir rápidamente sentencias o bloques. Por ejemplo si escribes "sout" y pulsas Ctrl + Espacio, se escribirá `System.out.println();`. También hay plantillas para escribir un bloque if-else, while, try-catch... Consulta las plantillas en `Window` → `Preferences` → `Java` → `Editor` → `Templates`


#####Parte 3: Repaso de Java: estructuras de control de flujo

Crea un paquete llamado `ControlDeFlujo` y codifica en una o varias clases los siguientes programas:

1) Preguntar al usuario el día de la semana e indicar si es laborable o no. Resolver utilizando la estructura `switch`.

- *Código*:

```java
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
	}

}
```

- *Ejecución*:

        Introduzca un dia de la semana
        Sabado
        No laborable

2) Pedir al usuario cinco cadenas de texto y generar una sola cadena uniéndolas todas. Escribir esa cadena por pantalla.

- *Código*:


```java
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
```



- *Ejecución*:


```
Introduzca una cadena
hola
Introduzca una cadena
buenas
Introduzca una cadena
tardes
Introduzca una cadena
...
Introduzca una cadena
Ups!
la supercadena es : holabuenastardes...Ups!
```



3) Ir pidiendo por teclado una serie de números enteros e irlos sumando. Se deja de pedir números al usuario cuando la cantidad supera el valor 50. Escribir por pantalla la suma de todos los números introducidos.

- *Código*:

```java
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
```



- *Ejecución*:

```
Introduzca un numero
20
Introduzca un numero
15
Introduzca un numero
10
Introduzca un numero
4
Introduzca un numero
2
La suma total es : 49

```



4) Pedir al usuario un número. Si introduce un valor inválido (por ejemplo una letra), se le volverá a solicitar que introduzca el número. 

Cuando termines, añade a continuación una expansión de este problema: pedir al usuario un número entre el 1 y el 10, pidiéndolo de nuevo si lo introduce mal.

Observa que estos dos bloques de código pueden ser reutilizados en cualquier punto de tus futuros programas en el que desees leer un número.


- *Código*:

```java
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
				System.out.println("EL numero es: " + num);
			} catch (Exception e) {
				sc=new Scanner(System.in);
			System.out.println("ERROR 23400:El valor es una letra");
			}
			
		}
		sc.close();
	}

}

```




- *Ejecución*:

````
Introduzca un numero del 1 al 10
a
ERROR 23400:El valor es una letra
Introduzca un numero del 1 al 10
11
EL numero no esta entre los valores pedidos : 11
Introduzca un numero del 1 al 10
9
````



5) Preguntar al usuario un número de mes (del 1 al 12) y preguntar si el año es bisiesto (sí o no). Escribir su número de días. Si los datos no están bien introducidos se volverán a pedir. Utilizar estructura `switch`.

- *Código*:

```java
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
				System.out.println("El año es bisiesto?");
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

```



- *Ejecución*:

```
Introduzca un mes
13
EL numero no esta entre los valores pedidos : 13
Introduzca un mes
12
El año es bisiesto?
no
31
```



6) Pedir al usuario dos números “a” y “b” entre el 1 y el 10. Mientras uno de ellos sea menor que el otro, escribir un símbolo “*” en la pantalla e incrementar en una unidad el número menor.

- *Código*:

```java
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
	
	}

}
```



- *Ejecución*:

```
Introduzca dos numeros entre el 1 y el 10
3
9
Introduzca un valor para incrementar el número más pequeño
8
El número menor incrementado es :11

```



7) Pedir al usuario un número entero y calcular el factorial de dicho número usando la estructura “do-while”. Repetir el ejercicio usando la estructura “while”, y repetirlo una vez más usando la estructura “for”.

- *Código (las tres versiones seguidas)*:

```java
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


```



- *Ejecución*:

```
Introduzca un numero entero para calcular su factorial
a
ERROR 23400:El valor es una letra
Introduzca un numero entero para calcular su factorial
3
El factorial de 3 es : 6
El factorial de 3 es : 6
El factorial de 3 es : 6

```



8) Basándote en la estructura `do-while`, diseña un menú de dos niveles, es decir: en un primer momento se pedirá escoger entre varias opciones, y en cada una de ellas se pedirá de nuevo escoger entre un nuevo conjunto. La temática es libre (cálculo de áreas, enciclopedia, etc). Es importante que tu programa reaccione correctamente ante entradas erróneas del usuario, y que en todos los menús haya una opción para volver.

  Ten en cuenta que codificar un menú correctamente no es trivial, conviene que pienses lo que vas a hacer antes de empezar a codificar.

```java
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
```



9) (opcional) Inventa un problema sencillo sobre estructuras de control de flujo. Resuélvelo para comprobar que el nivel de dificultad es adecuado y comparte el enunciado con tu compañer@ de al lado. Incluye aquí tanto tu enunciado como la solución.

- *Enunciado*:

```
Haz una tabla de 10x10 con numeros enteros entre 1 y 9 de forma aleatoria.
Visualizar la suma de las filas y columnas.
```

- *Código de la solución*

```java
package controlDeFlujo;

public class Opcional1 {
	public static void main(String[] args) {
//Haz una tabla de 10x10 con numeros enteros entre 1 y 9 de forma aleatoria.
//Visualizar la suma de las filas y columnas.

		int filas = 0;
		int columnas = 0;
		int[][] matriz = new int[10][10];
		int i = 0, j;
		while (i < matriz.length) {
			j = 0;
			while (j < matriz[i].length) {
				matriz[i][j] = (int) (Math.random() * 9 + 1);
				j += 1;
			}
			i += 1;
		}

		i = 0;
		while (i < matriz.length) {
			j = 0;
			System.out.println();
			while (j < matriz[i].length) {
				filas += matriz[i][j];
				j += 1;

			}
			System.out.println("La suma de la fila " + (i + 1) + " es " + filas);
			filas = 0;
			i += 1;

		}

		System.out.println();
			i=0;
		while (i < matriz.length) {
			j=0;
			System.out.println();
			while (j < matriz[i].length) {
				columnas += matriz[j][i];
				j += 1;

			}
			System.out.println("La suma de la columna " + (i + 1) + " es " + columnas);
			columnas = 0;
			i += 1;

		}

	}

}
```

- *Ejecución*:

```
La suma de la fila 1 es 54

La suma de la fila 2 es 37

La suma de la fila 3 es 38

La suma de la fila 4 es 48

La suma de la fila 5 es 53

La suma de la fila 6 es 39

La suma de la fila 7 es 42

La suma de la fila 8 es 56

La suma de la fila 9 es 55

La suma de la fila 10 es 30


La suma de la columna 1 es 48

La suma de la columna 2 es 44

La suma de la columna 3 es 54

La suma de la columna 4 es 36

La suma de la columna 5 es 46

La suma de la columna 6 es 50

La suma de la columna 7 es 51

La suma de la columna 8 es 50

La suma de la columna 9 es 31

La suma de la columna 10 es 42


```



10) (opcional) Resuelve el problema que tu compañer@ plantee.

- *Enunciado de tu compañer@:*

```
 Dada una cadena por teclado, decidir si es palíndroma, es decir si se lee igual de izquierda a derecha que de derecha a izquierda.
```

- *Código de la solución*

```java
public static void main(String[] args) {
		// Dada una cadena por teclado, decidir si es palíndroma, es decir si
		// se lee igual de izquierda a derecha que de derecha a izquierda.
		Scanner sc = new Scanner(System.in);
		String cadena;
		System.out.println("Introduce el posible palindromo.");
		cadena = sc.nextLine().toLowerCase();
		cadena = espaciosFuera(cadena);

		String cadenaAux = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaAux += cadena.charAt(i);
		}
		if (cadena.compareToIgnoreCase(cadenaAux) == 0)
			System.out.println("Es una cadena palindroma.");
		else
			System.out.println("La cadena no era palindroma.");
	}

	static public String espaciosFuera(String cadena) {
		int esp = -1, aux = -1, c = 0;
		String cadenaAux = cadena;
		for (int i = 0; i < cadena.length() && esp == -1; i++) {
			c += 1;
			if (cadena.charAt(i) == ' ') {
				esp = i;
				aux = i;
				cadenaAux = cadena.substring(0, i);
				break;
			}
		}
		do {
			esp = -1;
			for (int i = aux + 1; i < cadena.length() && esp == -1; i++) {
				c += 1;
				if (cadena.charAt(i) == ' ') {
					esp = i;
					cadenaAux += cadena.substring(aux + 1, i);
					aux = i;
					break;
				}
				if (cadena.charAt(i) != ' ' && i == (cadena.length() - 1) && cadena != cadenaAux) {
					cadenaAux += cadena.substring(aux + 1, c);
					break;
				}
			}
		} while (c < cadena.length());
		return cadenaAux;
	}


}

```



- *Ejecución*:

```
Introduce el posible palindromo.
2332
Es una cadena palindroma.


```

