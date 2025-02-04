package ud4.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0613 {
    public static boolean sonAnagramas(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static char[][] countChars(String frase) {
        int[] posiciones = new int[0];
        int[] contador = new int[0];
        int counter = 0;
        boolean counted = false;
        frase = frase.toLowerCase();
        char actual = ' ';

        char[] letras = frase.toCharArray();
        char[] newLetras = new char[letras.length];
        System.out.println("Array original:" + Arrays.toString(letras));
        for (int i = 0; i < letras.length; i++) {
            Random rnd = new Random();
            int newPos = rnd.nextInt(letras.length);
            char newLetter = letras[newPos]; // Almacenando lo que hay en la posición X (por ejemplo 7)
            // newLetras[newLetras.length - 1] = newLetter;
            newLetras[i] = newLetter; // 7 -> 1
        }
        System.out.println("Array nueva:" + Arrays.toString(newLetras));

        if (sonAnagramas(letras, newLetras)) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No lo son");
        }

        for (int i = 0; i < frase.length(); i++) {
            actual = frase.charAt(i);

            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == actual) {
                    counter++;
                    posiciones = Arrays.copyOf(posiciones, posiciones.length + 1);
                    posiciones[posiciones.length - 1] = j;
                    if (!counted) {
                        contador = Arrays.copyOf(contador, contador.length + 1);
                        contador[contador.length - 1] = counter;
                        counted = true;
                    } else {
                        contador[contador.length - 1] = counter;
                    }
                }
            }
            counter = 0;
            counted = false;
        }

        System.out.println(Arrays.toString(posiciones));
        System.out.println(Arrays.toString(contador));

        for (int i = 0; i < posiciones.length; i++) {

        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();
        System.out.println("Frase: " + frase);
        System.out.printf("Resultado:");
        countChars(frase);
    }
}
