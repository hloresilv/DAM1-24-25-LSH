package ud4.apuntes;

import java.util.Random;

public class FuncionBuscar {
    static int buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) return t[i];
        }
        return 0;
    }

    /**
     * Genera y devuelve un array de n números aleatorios entre -9 y 9, incluyendo el 0.
     * @param n
     * @return 
     */
    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(19) - 9; // Asigna un número entre -9 y 9
        }

        return t;
    }

    // Escribe una función que cuente las veces que aparece un valor clave en una tabla de enteros.
    static int contar(int t[], int clave) {
        int contador = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) contador++;
        }

        return contador;
    }

    // Escribe una función que devuelve la lista de posiciones de una tabla en las que se encuentra un valor clave.
    static int[] buscarVarios(int t[], int clave) {
        int p = 0;
        int[] posiciones = new int[p];

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) t[i] = posiciones[i];
        }

        return posiciones;
    }

    public static void main(String[] args) {
        int[] numeros = arrayAleatorio(30);

        int pos = buscar(numeros, 5);

        System.out.println("En la array de números hay un total de " + contar(numeros, 5) + " cincos");

        if (pos != -1)
            System.out.println("El primer 5 está en la posición " + pos);
        else
            System.out.println("No hay ningún 5");
    }
}
