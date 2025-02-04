package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Escribir un programa que pida una hora de la siguiente forma: hora, minutos y
segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
hora actual (10:41:59) => hora actual + 1 segundo (10:42:00)
 */

public class E0213 {
    public static void main(String[] args) {
        int hora, minutos, segundos;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta la hora siguiendo el siguiente formato (hh:mm:ss): ");
        String fecha = sc.nextLine();
        sc.close();

        hora = (fecha.charAt(0) - '0') * 10 + (fecha.charAt(1) - '0');
        minutos = (fecha.charAt(3) - '0') * 10 + (fecha.charAt(4) - '0');
        segundos = (fecha.charAt(6) - '0') * 10 + (fecha.charAt(7) - '0');

        segundos++;

        switch (segundos) {
            case 60:
                segundos = 0;
                minutos++;
                switch (minutos) {
                    case 60:
                        minutos = 0;
                        hora++;
                        switch (hora) {
                            case 24:
                                hora = 0;
                                segundos++;
                        }
                }
            default:
                break;
        }

        System.out.printf("La hora un segundo después será: %d horas con %d minutos y %d segundos.", hora, minutos,
                segundos);
    }
}