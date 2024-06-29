package laboratorio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inicio = "\nLaboratorio 7 - Arreglos" +
                        "\n1. Matriz Traspuesta" +
                        "\n2. Elemento más grande en cada fila" +
                        "\n3. Diagonal Secundaria Ordenada de Mayor a Menor" +
                        "\n4. Ordenamiento de Estudiantes y Notas" +
                        "\n5. Cerrar el programa";
        String mensaje = "\nSi desea regresar al menú presione 1, si desea cerrar el programa, presione otra tecla: ";
        int opcion = 0;

        Matriz matriz = new Matriz();
        Vector vector = new Vector();
        Matrizcuadrada matrizcuadrada = new Matrizcuadrada();
        Estudiantes estudiantes = new Estudiantes();

        while (opcion != 5) {
            System.out.println(inicio);
            System.out.print("\nElija su opción: ");
            try {
                opcion = Integer.parseInt(reader.readLine());
                if (opcion < 1 || opcion > 5) {
                    System.out.print("Ingrese una opción entre 1 y 5: ");
                }
            } catch (NumberFormatException | IOException error) {
                System.out.print("Ingreso una opción no permitida, vuelva a elegir una opción entre 1 y 5: ");
                continue;
            }

            switch (opcion) {
                case 1:
                    matriz.Traspuesta();
                    break;
                case 2:
                    vector.Mayor();
                    break;
                case 3:
                    matrizcuadrada.Diagonalsecundaria();
                    break;
                case 4:
                    estudiantes.Ordenado();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (opcion != 5) {
                System.out.print(mensaje);
                try {
                    String respuesta = reader.readLine();
                    if (!respuesta.equals("1")) {
                        opcion = 5;
                    }
                } catch (IOException e) {
                    System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
                    opcion = 5;
                }
            }
        }
    }
}
