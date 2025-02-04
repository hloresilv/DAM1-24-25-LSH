package ud4.apuntes;

import java.util.Arrays;
import java.util.Random;

/*
 * Escribe la función: static int[] rellenaPares(int longitud, int fin) que crea
 * y devuelve una tabla ordenada de la longitud especificada rellena con
 * números pares aleatorios en el rango desde 2 hasta el valor de fin inclusive.
 */
public class E0505 {
    static int[] rellenaPares(int longitud, int fin) {
        int[] t = new int[longitud];
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(2, fin + 1);
            if (t[i] % 2 != 0) {
                t[i] = t[i] + 1;
            }
        }
        
        Arrays.sort(t);
        Arrays.copyOf(null, fin, null);
        return t;
    }

    public static void main(String[] args) {
        int[] t = rellenaPares(10, 20);

        System.out.println(Arrays.toString(t));
    }
}
