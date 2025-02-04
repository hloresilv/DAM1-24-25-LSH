package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de
 * 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
 */

public class E0210 {
    public static void main(String[] args) {
        int nota;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nota (número entero) entre 0 y 10: ");
        nota = sc.nextInt();
        sc.close();

        String resultado = switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                yield "Insuficiente";
            }
            case 5 -> {
                yield "Aprobado";
            }
            case 6 -> {
                yield "Bien";
            }
            case 7, 8 -> {
                yield "Notable";
            }
            case 9, 10 -> {
                yield "Sobresaliente";
            }
            default -> {
                yield "La nota debe de estar entre 0 y 10 y ser un número entero.";
            }
        };

        System.out.println(resultado);
    }
}
