package Ranking_videojuegos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar puntaje");
            System.out.println("2. Buscar jugador");
            System.out.println("3. Mostrar ranking");
            System.out.println("4. Ordenar ranking");
            System.out.println("5. Valor máximo");
            System.out.println("6. Contar jugadores");
            System.out.println("7. Buscar repetidos");
            System.out.println("8. Nodo medio");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Puntaje: ");
                    int puntaje = sc.nextInt();
                    lista.insertar(nombre, puntaje);
                    break;

                case 2:
                    System.out.print("Nombre a buscar: ");
                    lista.buscar(sc.nextLine());
                    break;

                case 3:
                    lista.mostrar();
                    break;

                case 4:
                    lista.ordenar();
                    break;

                case 5:
                    lista.maximo();
                    break;

                case 6:
                    System.out.println("Cantidad: " + lista.contar());
                    break;

                case 7:
                    lista.repetidos();
                    break;

                case 8:
                    lista.nodoMedio();
                    break;
            }

        } while (opcion != 0);
    }
}
