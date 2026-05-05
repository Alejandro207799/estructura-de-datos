package Ejercicio_impresora;

import java.util.LinkedList;
import java.util.Queue;

public class Impresora {
    public static void main(String[] args) {


        Queue<String> cola = new LinkedList<>();


        cola.offer("Tarea1.pdf");
        cola.offer("Foto.png");
        cola.offer("CV.docx");

        System.out.println("Cola actual: " + cola);


        System.out.println("Siguiente a imprimir: " + cola.peek());

        System.out.println("Imprimiendo: " + cola.poll());
        System.out.println("Imprimiendo: " + cola.poll());

        System.out.println("Cola restante: " + cola);


        while (!cola.isEmpty()) {
            System.out.println("Imprimiendo: " + cola.poll());
        }

        System.out.println("Cola vacía: " + cola.isEmpty());

    }
}