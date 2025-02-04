package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
 * tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
 * bisiestos).
 */
public class E0212 {
    public static void main(String[] args) {
        int dia, mes, anho;
        boolean fechaCorrecta = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día del mes (1-31): ");
        dia = sc.nextInt();
        System.out.print("Introduce el número de mes (1-12): ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        anho = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                fechaCorrecta = dia >= 1 && dia <= 31;
                break;
            case 4, 6, 9, 11:
                fechaCorrecta = dia >= 1 && dia <= 30;
                break;
            case 2:
                fechaCorrecta = dia >= 1 && dia <= 28;
                break;
            default:
                fechaCorrecta = false;
        }

        if (fechaCorrecta) {
            System.out.printf("La fecha es correcta: %d/%d/%d\n", dia, mes, anho);
        } else {
            System.out.println("La fecha NO es correcta.");
        }
    }
}
