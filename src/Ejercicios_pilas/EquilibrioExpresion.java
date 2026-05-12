package Ejercicios_pilas;

import java.util.Stack;
import java.util.Scanner;

public class EquilibrioExpresion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una expresión:");
        String expresion = sc.nextLine();

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {

            char c = expresion.charAt(i);

            // Si abre
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }

            // Si cierra
            else if (c == ')' || c == ']' || c == '}') {

                // Error si está vacía
                if (pila.isEmpty()) {
                    System.out.println("Expresión incorrecta");
                    return;
                }

                // Sacar elemento
                char abierto = pila.pop();

                // Comparar
                if ((c == ')' && abierto != '(') ||
                        (c == ']' && abierto != '[') ||
                        (c == '}' && abierto != '{')) {

                    System.out.println("Expresión incorrecta");
                    return;
                }
            }
        }

        // Verificación final
        if (pila.isEmpty()) {
            System.out.println("Expresión equilibrada");
        } else {
            System.out.println("Faltan cerrar símbolos");
        }
    }
}