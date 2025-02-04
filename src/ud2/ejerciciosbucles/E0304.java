package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre
 * cuál es el árbol más alto. Para ello introducirá por teclado la altura (en centímetros) de
 * cada árbol (terminando la introducción de datos cuando se utilice el -1 como altura). Los
 * árboles se identifican mediante etiquetas con números únicos consecutivos, comenzando
 * en 0. Diseñar una aplicación que, al terminar la introducción de datos, muestre el número
 * y la altura del árbol más alto.
 */

public class E0304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int etiqueta = 0; // La etiqueta de los árboles comienza en 0
        int alturaMaxima = -1; 
        int etiquetaMasAlta = -1;
        int altura = 0; 

        System.out.println("Introduce la altura de los árboles en centímetros (Introduce -1 para terminar):");

        do {
            System.out.print("Altura del árbol " + etiqueta + ": ");
            altura = scanner.nextInt();

            if (altura != -1) {
                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                    etiquetaMasAlta = etiqueta;
                }
                etiqueta++;
            }
        } while (altura != -1);

        if (etiquetaMasAlta != -1) {
            System.out.println("El árbol más alto es el árbol con la etiqueta " + etiquetaMasAlta + " y tiene una altura de " + alturaMaxima + " cm.");
        } else {
            System.out.println("No se ingresaron alturas válidas.");
        }

        scanner.close();
    }
}
