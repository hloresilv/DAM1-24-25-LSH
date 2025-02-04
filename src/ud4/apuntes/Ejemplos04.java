package ud4.apuntes;

import java.util.Arrays;

public class Ejemplos04 {
    public static void main(String[] args) {
        int[] t = new int[100]; // Array con 100 elementos

        Arrays.fill(t, 7); // Inicializar la array con todo sietes
        Arrays.fill(t, 50, 60, 5); // De la posición 50 a la posición 6, poner cincos en vez de sietes

        // Sintaxis for-each para obtener la suma
        int suma = 0;
        for (int numero : t) {
            suma += numero;
            numero = 1;
        }
        System.out.println("Suma: " + suma);
        System.out.println(Arrays.toString(t)); // Mostrar la array
    }
}
