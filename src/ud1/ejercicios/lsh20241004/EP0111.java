package ud1.ejercicios.lsh20241004;

import java.util.Scanner;

/*
 * Un economista te ha encargado un programa para realizar cálculos con el IVA. La
 * aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla
 * el importe correspondiente al IVA y al total
 */
public class EP0111 {
    public static void main(String[] args) {
        double IVA;
        double baseImponible;
        double importeIva;
        double importeTotal;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce la base imponible:");
            baseImponible = sc.nextDouble();
            System.out.println("Introduce el IVA a aplicar");
            IVA = sc.nextDouble();
        }

        importeIva = baseImponible * IVA;
        importeTotal = importeIva + baseImponible;

        System.out.println("El importe correspondiente al IVA es: ");
        System.out.println("El importe correspondiente al total es: " + importeTotal);
    }
}
