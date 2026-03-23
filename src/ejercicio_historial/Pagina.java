package ejercicio_historial;

public class Pagina {

    String url;
    String fechaVisita;


    Pagina(String url, String fechaVisita) {
        this.url        = url;
        this.fechaVisita = fechaVisita;
    }


    public String toString() {
        return "URL: " + url + " | Visitada: " + fechaVisita;
    }
}