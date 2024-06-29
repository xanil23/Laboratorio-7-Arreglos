package laboratorio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Matrizcuadrada {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		private int filas_columnas = 0;
		public Matrizcuadrada(){
		}
		public void Diagonalsecundaria() {
		

		
		try {
			System.out.print("\nOpcion 3. Diagonal Secundaria Ordenada de Mayor a Menor");
			System.out.print("\nIngrese el numero de filas y columnas de la matriz: ");
			filas_columnas = Integer.parseInt(reader.readLine());
		
			
		} catch (IOException | NumberFormatException e) {
			System.err.println("Error al leer las dimensiones de la matriz: " + e.getMessage());
			return;
		}
	

	int[][] matriz = new int [filas_columnas][filas_columnas];
	
	try {
		for (int i = 0; i < filas_columnas; i++) {
			for (int j = 0; j < filas_columnas; j++) {
				try {
					System.out.print("Ingrese el valor para la fila " + i + " y columna " + j + ":");
					matriz [i][j] = Integer.parseInt(reader.readLine());
 				} catch (IOException | NumberFormatException e) {
 					System.err.println("Error al leer el valor de la matriz: " + e.getMessage());
 					return;
 				}
			}

		} 
	
	
	} catch (Exception e) {
		System.err.println("Error al leer la matriz: " + e.getMessage());
		return; 
	}
	
	System.out.println("Matriz ingresada: ");
	for (int i = 0; i < filas_columnas; i++) {
		for (int j = 0; j < filas_columnas; j++) {
			System.out.print(matriz[i][j] + "\t");
		}
		System.out.println(); 
		
	}
	
	  int[] diagonalSecundaria = obtenerDS(matriz);
      System.out.println("Vector Diagonal Secundaria Ordenado de Mayor a Menor:");
      for (int i = 0; i < diagonalSecundaria.length; i++) {
          System.out.println(diagonalSecundaria[i]);
      }
  }

  public static int[] obtenerDS(int[][] matriz) {
      int n = matriz.length;
      int[] diagonalSecundaria = new int[n];
      for (int i = 0; i < n; i++) {
          diagonalSecundaria[i] = matriz[i][n - 1 - i];
      }

      Arrays.sort(diagonalSecundaria);
      for (int i = 0; i < n / 2; i++) {
          int temp = diagonalSecundaria[i];
          diagonalSecundaria[i] = diagonalSecundaria[n - 1 - i];
          diagonalSecundaria[n - 1 - i] = temp;
      }

      return diagonalSecundaria;
  }
}
