package ejercicio_historial;

class Nodo {

    Pagina pagina;
    Nodo   siguiente;

    Nodo(Pagina pagina) {
        this.pagina    = pagina;
        this.siguiente = null;
    }
}
