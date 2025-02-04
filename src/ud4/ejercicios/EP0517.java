package ud4.ejercicios;

import java.util.Arrays;

/*
 * EP0517. Implementa la función: int[] suma(int t[], int numElementos), que crea y
 * devuelve una tabla con las sumas de los numElementos elementos consecutivos de t. Veamos un
 * ejemplo, sea t= [10, 1, 5, 8, 9, 2]. Si los elementos de t se agrupan de 3 en 3, se harán las sumas:
 * 10 + 1 + 5. Igual a 16.
 * 1 + 5 + 8. Igual a 14.
 * 5 + 8 + 9. Igual a 22.
 * 8 + 9 + 2. Igual a 19.
 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19].
 */
public class EP0517 {
    static int[] suma(int t[], int numElementos) {
        int[] suma = new int[0];
        int sumaGrupo = 0;
        int comprobados = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < numElementos; j++) {
                if (i + j < t.length) {
                    sumaGrupo += t[i + j];
                    comprobados++;
                }
            }
            if (comprobados == numElementos) {
                suma = Arrays.copyOf(suma, suma.length + 1);
                suma[suma.length - 1] = sumaGrupo;             
            }

            sumaGrupo = 0;
            comprobados = 0;
        }

        return suma;
    }

    public static void main(String[] args) {
        int[] t = { 10, 1, 5, 8, 9, 2 };
        int[] x = suma(t, 3);
        System.out.println(Arrays.toString(x));
    }
}
