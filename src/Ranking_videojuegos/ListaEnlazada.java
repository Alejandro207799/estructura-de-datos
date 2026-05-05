package Ranking_videojuegos;

public class ListaEnlazada {

    Nodo cabeza; // 🔥 ESTA LÍNEA ARREGLA EL ERROR PRINCIPAL

    // Insertar al final
    public void insertar(String nombre, int puntaje) {
        Nodo nuevo = new Nodo(nombre, puntaje);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Mostrar lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.nombre + " - " + actual.puntaje);
            actual = actual.siguiente;
        }
    }

    // Buscar jugador
    public void buscar(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado: " + actual.nombre + " - " + actual.puntaje);
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No encontrado");
    }

    // Contar nodos
    public int contar() {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    // Valor máximo
    public void maximo() {
        if (cabeza == null) return;

        int max = cabeza.puntaje;
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.puntaje > max) {
                max = actual.puntaje;
            }
            actual = actual.siguiente;
        }

        System.out.println("Mayor puntaje: " + max);
    }

    // Nodo medio
    public void nodoMedio() {
        int tamaño = contar();
        int medio = tamaño / 2;

        Nodo actual = cabeza;
        for (int i = 0; i < medio; i++) {
            actual = actual.siguiente;
        }

        if (actual != null) {
            System.out.println("Nodo medio: " + actual.nombre + " - " + actual.puntaje);
        }
    }

    // Buscar repetidos
    public void repetidos() {
        Nodo actual = cabeza;
        boolean hay = false;

        while (actual != null) {
            Nodo comparador = actual.siguiente;
            while (comparador != null) {
                if (actual.puntaje == comparador.puntaje) {
                    System.out.println("Puntaje repetido: " + actual.puntaje);
                    hay = true;
                }
                comparador = comparador.siguiente;
            }
            actual = actual.siguiente;
        }

        if (!hay) {
            System.out.println("No hay repetidos");
        }
    }

    // Ordenar
    public void ordenar() {
        if (cabeza == null) return;

        Nodo actual;
        Nodo siguiente;
        int tempPuntaje;
        String tempNombre;

        for (actual = cabeza; actual != null; actual = actual.siguiente) {
            for (siguiente = actual.siguiente; siguiente != null; siguiente = siguiente.siguiente) {
                if (actual.puntaje < siguiente.puntaje) {

                    tempPuntaje = actual.puntaje;
                    tempNombre = actual.nombre;

                    actual.puntaje = siguiente.puntaje;
                    actual.nombre = siguiente.nombre;

                    siguiente.puntaje = tempPuntaje;
                    siguiente.nombre = tempNombre;
                }
            }
        }

        System.out.println("Lista ordenada de mayor a menor");
    }
}