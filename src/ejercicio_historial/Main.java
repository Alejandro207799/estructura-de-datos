package ejercicio_historial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Historial historial = new Historial();
        Scanner sc = new Scanner(System.in);
        int opcion;


        historial.insertar(new Pagina("google.com",  "2024-03-20 09:00"));
        historial.insertar(new Pagina("youtube.com", "2024-03-20 09:15"));
        historial.insertar(new Pagina("gmail.com",   "2024-03-20 09:30"));

        do {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║    HISTORIAL DE NAVEGACIÓN   ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1. Ver historial             ║");
            System.out.println("║ 2. Agregar página            ║");
            System.out.println("║ 3. Buscar página             ║");
            System.out.println("║ 4. Limpiar historial         ║");
            System.out.println("║ 0. Salir                     ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    historial.mostrarHistorial();
                    break;

                case 2:
                    System.out.print("URL: ");
                    String url = sc.nextLine();
                    System.out.print("Fecha/hora (ej: 2024-03-20 10:00): ");
                    String fecha = sc.nextLine();
                    historial.insertar(new Pagina(url, fecha));
                    break;

                case 3:
                    System.out.print("Buscar URL (o parte de ella): ");
                    Pagina encontrada = historial.buscar(sc.nextLine());
                    if (encontrada != null) {
                        System.out.println("🔍 Encontrada: " + encontrada);
                    } else {
                        System.out.println("❌ No se encontró esa página.");
                    }
                    break;

                case 4:
                    historial.limpiarHistorial();
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}