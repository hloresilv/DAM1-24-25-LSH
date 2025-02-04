package ud4.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ConceptosProgramacion {
    static Scanner sc;

    static String fraseAleatoria(String[] t) {
        Random rnd = new Random();
        int numero = rnd.nextInt(t.length);
        return t[numero];
    }

    static char solicitarLetra(String frase) {
        sc = new Scanner(System.in);
        System.out.print("Introduce una letra por teclado: ");
        char letra = sc.next().charAt(0);
        return letra;
    }

    static boolean validarLetra(String frase, char letra) {
        char[] t = frase.toCharArray();
        for (int i = 0; i < t.length; i++) {
            if (letra == t[i]) {
                System.out.println("¡La letra está en la frase!");
                return true;
            }
        }
        return false;
    }

    public static void iniciarJuego(String[] conceptos) {
        String frase = fraseAleatoria(conceptos);
        System.out.println(frase);

        char letra;
        do {
            letra = solicitarLetra(frase);
        } while (validarLetra(frase, letra));

        System.out.println("La letra introducida no está en la frase, FIN DEL JUEGO.");
        sc.close();
    }

    public static void main(String[] args) {
        final String[] conceptos = { "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto" };

        iniciarJuego(conceptos);
    }
}
