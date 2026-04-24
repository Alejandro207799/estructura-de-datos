package Pilas_Colas;

class Pila {
    private Nodo cima;

    public Pila() {
        cima = null;
    }


    public void push(String pagina) {
        Nodo nuevo = new Nodo(pagina);
        nuevo.siguiente = cima;
        cima = nuevo;
    }


    public String pop() {
        if (estaVacia()) {
            return "No hay páginas";
        }
        String pagina = cima.pagina;
        cima = cima.siguiente;
        return pagina;
    }


    public String peek() {
        if (estaVacia()) {
            return "No hay páginas";
        }
        return cima.pagina;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}
