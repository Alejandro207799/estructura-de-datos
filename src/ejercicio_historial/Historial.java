package ejercicio_historial;

class Historial {

    Nodo head;
    int  tamaño;

    Historial() {
        head   = null;
        tamaño = 0;
    }


    void insertar(Pagina pagina) {
        Nodo nuevo = new Nodo(pagina);


        nuevo.siguiente = head;


        head = nuevo;

        tamaño++;
        System.out.println(" Página guardada: " + pagina.url);
    }




    Pagina buscar(String url) {
        Nodo actual = head;
        while (actual != null) {

            if (actual.pagina.url.contains(url)) {
                return actual.pagina;
            }
            actual = actual.siguiente;
        }
        return null;
    }


    void limpiarHistorial() {
        head   = null;
        tamaño = 0;
        System.out.println("🗑  Historial eliminado.");
    }



    void mostrarHistorial() {
        if (head == null) {
            System.out.println(" El historial está vacío.");
            return;
        }

        System.out.println("\n HISTORIAL (" + tamaño + " páginas):");
        System.out.println("─".repeat(50));

        Nodo actual = head;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". " + actual.pagina);
            actual = actual.siguiente;
            i++;
        }
        System.out.println("─".repeat(50));
    }
}