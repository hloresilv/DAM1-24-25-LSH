package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */
public class E0312 {
    public static void main(String[] args) {
        int numero = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una calificación: ");
        total = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce otra calificación: ");
            numero = sc.nextInt();
            total = numero + total;
        }

        sc.close();
        String resultado = ((total / 5) < 5) ? "Hay suspensos." : "No hay suspensos.";
        System.out.println(resultado);
    }
}
