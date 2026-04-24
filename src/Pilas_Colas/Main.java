package Pilas_Colas;

public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        navegador.visitar("google.com");
        navegador.visitar("youtube.com");
        navegador.visitar("github.com");

        navegador.paginaActual();

        navegador.atras();
        navegador.atras();
    }
}
