package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
 * EjArrays08. Leer el nombre y sueldo de 20 empleados y mostrar el nombre y sueldo del empleado que más gana.
 */

public class EjArrays08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMERO_EMPLEADOS = 20;
        int contador = 1;
        String[] nombres = new String[0];
        double[] sueldos = new double[0];

        while(nombres.length != NUMERO_EMPLEADOS) {
            System.out.print("Introduce el nombre del empleado " + contador + ": ");
            contador++; // por puro cosmético, aunque sea innecesario
            nombres = Arrays.copyOf(nombres, nombres.length + 1);
            nombres[nombres.length - 1] = sc.nextLine();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el sueldo del empleado " + nombres[i] + " (empleado nº " + i + "): ");
            sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
            sueldos[sueldos.length - 1] = sc.nextDouble();
        }

        sc.close();

        double sueldoMax = 0.0;
        int posicion = 0;
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] > sueldoMax) {
                sueldoMax = sueldos[i];
                posicion = i;
            }
        }

        System.out.println("El sueldo del empleado que más gana es: " + sueldoMax + " euros.");
        System.out.println("El nombre del empleado que más gana es: " + nombres[posicion] + ".");
    }
}
