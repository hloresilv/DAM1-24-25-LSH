package ud3.ejercicios;

import java.util.Scanner;

/*
 * E0706. Escribir un programa que lea por teclado una hora cualquiera y un número n que
 * representa una cantidad en segundos. El programa mostrará la hora introducida y las n
 * siguientes, que se diferencian en un segundo. Para ello hemos de diseñar previamente la
 * clase Hora que dispone de los atributos hora, minuto y segundo. Los valores de los
 * atributos se controlaran mediante métodos set/get.
 */

public class Hora {
    private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;

    public void getHora() {
        System.out.println("Hora actual: " + hora + ":" + minuto + ":" + segundo);

        System.out.println("Horas siguientes diferenciadas en un segundo: ");
        for (int i = segundo + 1; i <= 59; i++) {
            System.out.print(hora + ":" + minuto + ":" + i);
            System.out.println();
        }
    }

    public void setHora(int hora, int minuto, int segundo, int cantidadSegundos) {
        if (hora > -1 && hora < 25)
            this.hora = hora;
        if (minuto > -1 && minuto < 61)
            this.minuto = minuto;
        if (segundo > -1 && segundo < 61)            
            this.segundo = segundo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora como un número entero: ");
        int hora = sc.nextInt();
        System.out.print("Introduce un minuto como un número entero: ");
        int minuto = sc.nextInt();
        System.out.print("Introduce un segundo como un número entero: ");
        int segundo = sc.nextInt();
        System.out.print("Introduce una cantidad en segundos como un número entero: ");
        int cantidadSegundos = sc.nextInt();
        sc.close();

        Hora hora1 = new Hora();
        hora1.setHora(hora, minuto, segundo, cantidadSegundos);
        hora1.getHora();
    }
}
