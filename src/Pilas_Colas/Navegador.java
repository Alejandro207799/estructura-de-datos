package Pilas_Colas;

class Navegador {
    private Pila historial;

    public Navegador() {
        historial = new Pila();
    }

    public void visitar(String pagina) {
        historial.push(pagina);
        System.out.println("Visitando: " + pagina);
    }


    public void atras() {
        historial.pop();
        System.out.println("Página actual: " + historial.peek());
    }


    public void paginaActual() {
        System.out.println("Página actual: " + historial.peek());
    }
}
