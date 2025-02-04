package ud1.expresiones;

import java.util.Locale;
import java.util.Scanner;

/**
 * Este programa solicita al usuario el importe en euros que desea invertir 
 * en número de años que durará la inversión y, usando la fórmula del 
 * interés compuesto y para un valor fijo de interés a pagar una vez al año
 * calcula el importe final que tendrá el usuario.
 */
public class InteresCompuesto {
    public static void main(String[] args) {
        // Declaración de constantes y variables
        double importeInicial, importeFinal;
        int anhos;
        
        final double INTERES = 0.05;
        final double NUM_PAGOS = 1;
        
        try (Scanner sc = new Scanner(System.in)) {
            // Entrada de datos
            System.out.println("Importe a invertir (euros): ");
            importeInicial = sc.nextDouble();
            sc.useLocale(Locale.US);
            System.out.println("Duración de la inversión (años)");
            anhos = sc.nextInt();
        }

        // Proceso
        double base = 1 + INTERES / NUM_PAGOS;
        double exponente = NUM_PAGOS * anhos;

        importeFinal = importeInicial * Math.pow(base, exponente);
        System.out.println(importeFinal);   
    }
}
