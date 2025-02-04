package ud1.expresiones;

import java.util.Scanner;

/**
 * Este programa solicita al usuario el importe en euros que desea invertir 
 * en número de años que durará la inversión y, usando la fórmula del 
 * interés compuesto y para un valor fijo de interés a pagar una vez al año
 * calcula el importe final que tendrá el usuario.
 */
public class ConversionTemperatura {
    public static void main(String[] args) {
        // Declaración de constantes y variables
        double gradosf;
        
        try (Scanner sc = new Scanner(System.in)) {
            // Entrada de datos
            System.out.println("Temperatura en Farengeith: ");
            gradosf = sc.nextDouble();
        }

        // Proceso
        double gradosc = 5/9.0 * (gradosf-32);
        System.out.println(gradosc);
    }
}
