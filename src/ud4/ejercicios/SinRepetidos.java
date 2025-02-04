package ud4.ejercicios;

import java.util.Arrays;

public class SinRepetidos {
    static int[] sinRepetidos(int t[]) {
        int[] sinRepetidos = new int[0];
        sinRepetidos = Arrays.copyOf(t, t.length);

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < sinRepetidos.length; j++) {
                if (t[i] != sinRepetidos[j]) {
                    sinRepetidos[j] = t[i];
                }
            }         
        }

        return sinRepetidos;
    }

    public static void main(String[] args) {
        int[] t = {1, 3, 4, 5, 3, 8, 9};
        int[] b = sinRepetidos(t);
        System.out.println(Arrays.toString(b));
    }
}
