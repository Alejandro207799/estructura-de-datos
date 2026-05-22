package EjerciciosDeArbol;



public class SistemaArbol {


    public void preorden(NodoBinario nodo) {
        if (nodo == null) return;

        System.out.print(nodo.codigo + " ");
        preorden(nodo.izquierdo);
        preorden(nodo.derecho);
    }


    public void inorden(NodoBinario nodo) {
        if (nodo == null) return;

        inorden(nodo.izquierdo);
        System.out.print(nodo.codigo + " ");
        inorden(nodo.derecho);
    }


    public void postorden(NodoBinario nodo) {
        if (nodo == null) return;

        postorden(nodo.izquierdo);
        postorden(nodo.derecho);
        System.out.print(nodo.codigo + " ");
    }

    public static void main(String[] args) {
        SistemaArbol arbol = new SistemaArbol();


        NodoBinario raiz = new NodoBinario(192550);
        NodoBinario n191830 = new NodoBinario(191830);
        NodoBinario n191070 = new NodoBinario(191070);
        NodoBinario n191820 = new NodoBinario(191820);
        NodoBinario n191840 = new NodoBinario(191840);


        raiz.izquierdo = n191830;
        raiz.derecho = n191070;

        n191830.izquierdo = n191820;
        n191830.derecho = n191840;


        System.out.println("--- RECORRIDOS DEL ÁRBOL ACADÉMICO ---");

        System.out.print("Preorden:  ");
        arbol.preorden(raiz);
        System.out.println();

        System.out.print("Inorden:   ");
        arbol.inorden(raiz);
        System.out.println();

        System.out.print("Postorden: ");
        arbol.postorden(raiz);
        System.out.println();
    }
}