package ud4.ejercicios;

import java.util.Arrays;

public class ArraysEstadisticas {
    static int suma(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        return suma;
    }

    static int minimo(int[] numeros) {
        int minimo = 999999999;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return minimo;
    }

    static int maximo(int[] numeros) {
        int maximo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }

    static double media(int[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double media = suma / numeros.length;

        return media;
    }

    static double mediana(int[] numeros) {
        int[] mediana = new int[2];
        mediana = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(mediana);

        if (mediana.length % 2 == 0) {
            int[] t = new int[2];
            t[0] = mediana[mediana.length/2];
            t[1] = mediana[mediana.length/2 + 1];
            return media(t);
        }

        return mediana[numeros.length/2];
    }

    static int moda(int[] numeros) {
        int[] moda = new int[0];
        moda = Arrays.copyOf(numeros, numeros.length);
        for (int i = 0; i < numeros.length; i++) {
            switch(numeros[i]) {
                case 0:
                    moda[0]++;
                    break;
                case 1:
                    moda[1]++;
                    break;
                case 2:
                    moda[2]++;
                    break;
                case 3:
                    moda[3]++;
                    break;
                case 4:
                    moda[4]++;
                    break;
                case 5:
                    moda[5]++;
                    break;
                case 6:
                    moda[6]++;
                    break;
                case 7:
                    moda[7]++;
                    break;
                case 8:
                    moda[8]++;
                    break;
                case 9:
                    moda[9]++;
                    break;
                default:
                    continue;
            }
        }

        int maximo = 0;
        for (int i = 0; i < moda.length; i++) {
            if (moda[i] > maximo) {
                maximo = i;
            }
        }

        return maximo;
    }

    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = { 2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7 };
        int[] numeros2 = { 2, 4, 6, 7, 4, 9, 2, 5, 6, 7 };
        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");
    }

}
