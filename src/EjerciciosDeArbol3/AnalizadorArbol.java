package EjerciciosDeArbol3;



public class AnalizadorArbol {


    public int contarNodos(NodoBinario nodo) {
        // CASO BASE: Si el nodo está vacío, no suma al conteo
        if (nodo == null) {
            return 0;
        }

        return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
    }


    public int altura(NodoBinario nodo) {

        if (nodo == null) {
            return -1;
        }


        int alturaIzquierda = altura(nodo.izquierdo);
        int alturaDerecha = altura(nodo.derecho);


        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    public static void main(String[] args) {
        AnalizadorArbol analizador = new AnalizadorArbol();


        NodoBinario raiz = new NodoBinario(192550);
        NodoBinario n191830 = new NodoBinario(191830);
        NodoBinario n191070 = new NodoBinario(191070);
        NodoBinario n191820 = new NodoBinario(191820);
        NodoBinario n191840 = new NodoBinario(191840);


        raiz.izquierdo = n191830;
        raiz.derecho = n191070;
        n191830.izquierdo = n191820;
        n191830.derecho = n191840;


        System.out.println("Cantidad de nodos:");
        System.out.println(analizador.contarNodos(raiz));

        System.out.println("Altura del árbol:");
        System.out.println(analizador.altura(raiz));
    }
}