package Ejercicios_pilas2;

import java.util.Stack;
import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();


        Stack<Character> pila = new Stack<>();

        // Meter letras en la pila
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }


        String invertida = "";


        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }


        System.out.println("Cadena invertida: " + invertida);
    }
}