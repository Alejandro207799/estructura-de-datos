package ejercicio2_listas;

class ListaContactos {

    Nodo head;
    int  tamaño;

    ListaContactos() {
        head   = null;
        tamaño = 0;
    }


    void insertar(Contacto contacto) {
        Nodo nuevo = new Nodo(contacto);

        if (head == null) {
            head = nuevo;          // lista vacía: el nuevo es la cabeza
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {  // llegar al final
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;  // enlazar el nuevo al último
        }
        tamaño++;
    }


    Contacto buscar(String nombre) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.contacto.nombre.equalsIgnoreCase(nombre)) {
                return actual.contacto;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    boolean eliminar(String nombre) {
        if (head == null) return false;


        if (head.contacto.nombre.equalsIgnoreCase(nombre)) {
            head = head.siguiente;
            tamaño--;
            return true;
        }


        Nodo actual = head;
        while (actual.siguiente != null) {
            if (actual.siguiente.contacto.nombre
                    .equalsIgnoreCase(nombre)) {
                actual.siguiente = actual.siguiente.siguiente;
                tamaño--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }


    void mostrarTodos() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo actual = head;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". " + actual.contacto);
            actual = actual.siguiente;
            i++;
        }
    }
}