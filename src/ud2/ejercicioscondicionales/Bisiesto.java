package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Año Bisiesto (Bisiesto.java). Haz un programa que pida por teclado un número de año y que
 * muestre un mensaje indicando si el año es bisiesto o no.
 * Investiga el agoritmo para calcular si un año es bisiesto o no.
 * “Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100, en cuyo
 * caso también ha de ser divisible entre 400.”
 * Ejemplos:
 * ● Son bisiestos: 4, 40, 120, 144, 400
 */

public class Bisiesto {
    public static void main(String[] args) {
        double anho;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de año: ");
        anho = sc.nextDouble();
        sc.close();

        if ((anho % 4 == 0) && !(anho % 100 == 0)) {
            System.out.println("El año introducido es bisiesto.");
        } else if ((anho % 100 == 0) && (anho % 400 == 0)) {
            System.out.println("El año introducido es bisiesto.");
        } else {
            System.out.println("El año introducido no es bisiesto.");
        }
    }
}
