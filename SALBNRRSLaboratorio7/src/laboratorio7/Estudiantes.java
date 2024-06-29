package laboratorio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Estudiantes {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		private int es = 0;
		public Estudiantes() {
		}
		public void Ordenado() {
		try {
			System.out.print("\nOpcion 4. Ordenamiento de Estudiantes y Notas");
			System.out.print("\nIngrese el numero de estudiantes: ");
			es = Integer.parseInt(reader.readLine());
			
			if (es <= 0) {
				System.err.println("El numero de estudiantes debe ser mayor a 0");
				return;
			}
		}
			catch (IOException e) {
				System.out.println("Error al leer la entrada del usuario: " + e.getMessage());
		return;
			
			}
		
		String[] estudiantes = new String[es];
		int [] notas = new int[es];
		
		try {
			
			for (int i = 0; i < es; i++) {
				
				System.out.print("Ingrese el nombre del estudiante " + (i+1) + ":");
				estudiantes[i] = reader.readLine();
				System.out.print("Ingrese la nota del estudiante " + (i+1) + ":");
				notas[i] = Integer.parseInt(reader.readLine());
				}
			} catch (IOException | NumberFormatException e) {
				System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
				return;
		}
		
		System.out.println("\nOrdenar por:");
		System.out.println("\n1. Notas de Menor a Mayor");
		System.out.println("\n2. Orden Alfabetico");
		
		int opcion = 0;
		try {
			opcion = Integer.parseInt(reader.readLine());
			
		} catch (IOException | NumberFormatException e) {
			System.err.println("Error al leer la entrada de usuario: " + e.getMessage());
			return;
		}
		if (opcion == 1) {
			for (int i = 0; i < es - 1; i++) {
				for (int j = i + 1; j < es; j++) {
					if (notas[i] > notas[j]) {
						int auxNota = notas [i];
						notas[i] = notas[j];
						notas[j] = auxNota;
						
						String auxEstudiante = estudiantes [i];
						estudiantes[i] = estudiantes[j];
						estudiantes[j] = auxEstudiante;
					}
				}
			}
			
		} else if (opcion == 2) {
			for (int i = 0; i < es - 1; i++) {
				for (int j = i + 1; j < es; j++) {
					if (estudiantes[i].compareTo(estudiantes[j]) > 0) {
						String auxEstudiante = estudiantes[i];
						estudiantes[i] = estudiantes[j];
						estudiantes[j] = auxEstudiante;
						
						int auxNota = notas[i];
						notas[i] = notas[j];
						notas[j] = auxNota;
					}
				}
			
			}
		} else {
			System.err.println("Opcion no valida.");
			return;
		}
		System.out.println("Listado de estudiantes: ");
		for (int i = 0; i < es; i++) {
			System.out.println("Estudiante: " + (i + 1) + ": " + estudiantes[i] + "\tNota: " + notas[i]);	
	
	}
}
}
