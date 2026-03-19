package ejercicio2_listas;
import java.util.Scanner;

public class SistemaContactos {

    public static void main(String[] args) {

        ListaContactos lista = new ListaContactos();
        Scanner sc = new Scanner(System.in);
        int opcion;


        lista.insertar(new Contacto("Ana García", "3001234567", "ana@mail.com"));
        lista.insertar(new Contacto("Juan Pérez", "3109876543", "juan@mail.com"));
        lista.insertar(new Contacto("María López", "3205551234", ""));

        do {
            System.out.println("\n1. Ver todos");
            System.out.println("2. Agregar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    lista.mostrarTodos();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    lista.insertar(new Contacto(nom, tel, email));
                    break;

                case 3:
                    System.out.print("Buscar: ");
                    Contacto c = lista.buscar(sc.nextLine());
                    System.out.println(c != null ? c : "No encontrado");
                    break;

                case 4:
                    System.out.print("Eliminar: ");
                    boolean ok = lista.eliminar(sc.nextLine());
                    System.out.println(ok ? "Eliminado" : "No encontrado");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}