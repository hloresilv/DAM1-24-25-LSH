package ud4.ejercicios;

import java.util.Arrays;

public class BuscandoLetras {
    static int[] buscarLetra(String cadena, char letra) {
        char[] tablaChar = cadena.toCharArray();
        int[] posiciones = new int[0];
        
        for (int i = 0; i < tablaChar.length; i++) {
            if (tablaChar[i] == letra) {
                posiciones = Arrays.copyOf(posiciones, posiciones.length + 1);
                posiciones[posiciones.length - 1] = i;
            }      
        }

        return posiciones;
    }

    public static void main(String[] args) {
        int[] t = buscarLetra("Hola mundo", 'o');
        System.out.println(Arrays.toString(t));
    }
}
