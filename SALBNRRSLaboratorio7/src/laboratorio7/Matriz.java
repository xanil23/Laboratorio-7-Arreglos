

//Laboratorio 7: Steven Ampie, Linette Bonilla, Nayim Rodriguez, Ricardo Solis
package laboratorio7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz {
	private int filas = 0;
	private int columnas = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		public Matriz() {
			
		}
		
		public void Traspuesta() {
			
		
		try {
			System.out.print("\nOpcion 1. Matriz Traspuesta");
			System.out.print("\nIngrese el numero de filas de la matriz: ");
			filas = Integer.parseInt(reader.readLine());
			
			System.out.print("Ingrese el numero de columnas de la matriz: ");
			columnas = Integer.parseInt(reader.readLine());
			
		} catch (IOException | NumberFormatException e) {
			System.err.println("Error al leer las dimensiones de la matriz: " + e.getMessage());
			return;
		}
	

	int[][] matriz = new int [filas][columnas];
	
	try {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
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
	for (int i = 0; i < filas; i++) {
		for (int j = 0; j < columnas; j++) {
			System.out.print(matriz[i][j] + "\t");
		}
		System.out.println(); 
		
	}
	
	System.out.println("Matriz traspuesta: ");
	for (int i = 0; i < columnas; i++) {
		for (int j = 0; j < filas; j++) {
			System.out.print(matriz[j][i] + "\t"); 
	
		}
		System.out.println();
	}
	}
}

