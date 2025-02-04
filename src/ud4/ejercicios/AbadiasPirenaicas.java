package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {
    static String localizarAbadias(int[] cordillera) {
        int posicion = 0;
        int maxAbadias = 0;
        int[] lugaresAbadia = new int[0];

        for (int i = cordillera.length - 1; i >= 0; i--) {
            if (cordillera[i] > cordillera[i - 1]) {
                maxAbadias++;
            } else {
                posicion = cordillera[i]; 
                break;
            }
        }

        System.arraycopy(cordillera, posicion, lugaresAbadia, cordillera.length, maxAbadias);
        return "Se pueden construir " + maxAbadias + " abadías en las cordilleras " + Arrays.toString(lugaresAbadia);
    }

    static int[] getMontanasAbadias(int[] MontanasCordillera) {
        int maxAltitud = -1;
        int[] lugaresAbadia = new int[0];

        for (int i = MontanasCordillera.length - 1; i >= 0; i--) {
            if (MontanasCordillera[i] > maxAltitud) {
                maxAltitud = MontanasCordillera[i];
                lugaresAbadia = Arrays.copyOf(lugaresAbadia, lugaresAbadia.length + 1);
                lugaresAbadia[lugaresAbadia.length - 1] = i + 1;
            }
        }

        Arrays.sort(lugaresAbadia);
        return lugaresAbadia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cordillera = new int[0];
        int valor = 0;
        int contador = 0; // No es necesario, pero facilita la introducción de datos para el usuario

        System.out.println("Introduce de Oeste a Este, en metros, las alturas de las montañas en la cordillera.");
        while (valor >= 0 && cordillera.length < 1000) {
            System.out.print("Introduce la altura número " + contador + ": ");
            valor = sc.nextInt();

            if (valor >= 0) {
                cordillera = Arrays.copyOf(cordillera, cordillera.length + 1);
                cordillera[cordillera.length - 1] = valor;
                contador++;
            }
        }
        sc.close();

        // localizarAbadias(cordillera);
        int[] lugaresAbadia = getMontanasAbadias(cordillera);
        System.out.println(Arrays.toString(lugaresAbadia));
    }
}
