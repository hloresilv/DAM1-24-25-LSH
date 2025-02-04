package ud2.ejerciciosbucles;

import java.util.Scanner;
/*
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota
 * igual a 4) y suspensos.
 */
public class E0313 {
    public static void main(String[] args) {
        int numero = 0;
        int condicionados = 0;
        int aprobados = 0;
        int suspensos = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce una calificación: ");
            numero = sc.nextInt();
            if (numero == 4)
                condicionados++;
            if (numero >= 5)
                aprobados++;
            if (numero < 5)
                suspensos++;
        }
        sc.close();
        
        System.out.println("Número de alumnos aprobados: " + aprobados);
        System.out.println("Número de alumnos condicionados: " + condicionados);
        System.out.println("Número de alumnos suspensos: " + suspensos);
    }
}
