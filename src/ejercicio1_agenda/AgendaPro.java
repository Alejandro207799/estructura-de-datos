package ejercicio1_agenda;

import java.util.Scanner;

public class AgendaPro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int maximo = 10;
        String[] nombres = new String[maximo];
        long[] telefonos = new long[maximo];
        int contador = 0;

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE AGENDA (EJERCICIO 1) ---");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Ver todos");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = leer.nextInt();

            if (opcion == 1) {
                if (contador < maximo) {
                    System.out.print("Nombre: ");
                    nombres[contador] = leer.next();
                    System.out.print("Telefono: ");
                    telefonos[contador] = leer.nextLong();
                    contador++;
                    System.out.println("¡Contacto guardado!");
                } else {
                    System.out.println("Error: Agenda llena.");
                }
            }
            else if (opcion == 2) {
                System.out.println("\n--- LISTA DE CONTACTOS ---");
                for (int i = 0; i < contador; i++) {
                    System.out.println(nombres[i] + ": " + telefonos[i]);
                }
            }
            else if (opcion == 3) {
                System.out.print("Nombre a buscar: ");
                String buscado = leer.next();
                boolean encontrado = false;

                for (int i = 0; i < contador; i++) {
                    if (nombres[i].equalsIgnoreCase(buscado)) {
                        System.out.println("Resultado: " + nombres[i] + " - Tel: " + telefonos[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) System.out.println("No se encontro el contacto.");
            }

        } while (opcion != 4);

        System.out.println("Cerrando agenda...");
        leer.close();
    }
}