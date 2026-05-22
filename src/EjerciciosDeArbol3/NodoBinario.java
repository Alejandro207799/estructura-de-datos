package EjerciciosDeArbol3;


public class NodoBinario {
    int codigo;
    NodoBinario izquierdo;
    NodoBinario derecho;

    public NodoBinario(int codigo) {
        this.codigo = codigo;
        this.izquierdo = null;
        this.derecho = null;
    }
}