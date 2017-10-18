package controlDeFlujo;

public class Opcional1 {
	public static void main(String[] args) {
		// Haz una tabla de 10x10 con numeros enteros entre 1 y 9 de forma aleatoria.
		// Suma filas y columnas por separado visualizando los resultados por pantalla.

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
