package Ranking_videojuegos;

public class Nodo {
    String nombre;
    int puntaje;
    Nodo siguiente;

    public Nodo(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.siguiente = null;
    }
}
