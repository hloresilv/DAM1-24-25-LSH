package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * 4. Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la
 * fecha correspondiente al día siguiente
 */

public class E0214 {
    public static void main(String[] args) {
        String nombreMes = "";
        String fecha = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una fecha en el siguiente formato (dd:mm:aaaa): ");
        fecha = sc.nextLine();

        /*
         * El formato será dd:mm:yyyy. Por tanto, las posiciones 2, 5 y mayores a 9 no se leerán, ya que serán cualquier divisor (:, -, o cualquier otro caracter)
         * El máximo número téorico posible a leer sería 9999, que luego pasaría a ser 10000 si el usuario introduce 12 como mes y 31 como día.
         * Al solo leerse 4 caracteres como máximo, nunca se excederá el rango int. Ni tampoco habrán excepciones por caracteres inválidos al usarse extended unicode.
         */
        int dia = (fecha.charAt(0) - '0') * 10 + (fecha.charAt(1) - '0');
        int mes = (fecha.charAt(3) - '0') * 10 + (fecha.charAt(4) - '0');
        int anho = (fecha.charAt(6) - '0') * 1000 + (fecha.charAt(7) - '0') * 100 + (fecha.charAt(8) - '0') * 10
                + (fecha.charAt(9) - '0');

        while (dia > 31 || dia < 1 || mes > 12 || mes < 1) {
            System.out.println("Fecha introducida en formato incorrecto.");
            System.out.print("Introduce una fecha en el siguiente formato usando números (dd:mm:aaaa): ");
            fecha = sc.nextLine();

            dia = (fecha.charAt(0) - '0') * 10 + (fecha.charAt(1) - '0');
            mes = (fecha.charAt(3) - '0') * 10 + (fecha.charAt(4) - '0');
            anho = (fecha.charAt(6) - '0') * 1000 + (fecha.charAt(7) - '0') * 100 + (fecha.charAt(8) - '0') * 10
                + (fecha.charAt(9) - '0');
        } 

        sc.close(); 

        /*
         * Si nos encontramos en el último día de un mes, incrementaremos el mes además del día. En caso contrario, solo el día.
         * Si nos encontramos en el último día del último mes, incrementaremos el año también.
         * Enero tendrá siempre 31 días, Abril tendrá siempre 30, etcétera.
         * Febrero es un caso especial, calcularemos si es bisiesto para determinar si debemos elegir 28 o 29 como el día máximo.
         * Al no haber dado funciones, el mismo algoritmo se debe repetir 12 veces, haciendo el programa muy largo...
         */
        switch (mes) {
            case 1: // Enero
                if (dia == 31) {
                    nombreMes = "Febrero";
                    dia = 1;
                } else {
                    nombreMes = "Enero";
                    dia++;
                }
                break;
            case 2: // Febrero
                // Calculamos si el año es bisiesto en base al ejercicio "Bisiesto.java"
                if (((anho % 4 == 0) && !(anho % 100 == 0)) || ((anho % 100 == 0) && (anho % 400 == 0))) {
                    // Si es bisiesto, Febrero tendrá 29 días en vez de 28, y deberemos incrementar el mes si nos encontramos en el último día
                    if (dia == 29) {
                        nombreMes = "Marzo";
                        dia = 1;
                    } else {
                        nombreMes = "Febrero";
                        dia++;
                    }
                } else {
                    if (dia == 28) {
                        nombreMes = "Marzo";
                        dia = 1;
                    } else {
                        nombreMes = "Febrero";
                        dia++;
                    }
                }
                break;
            case 3: // Marzo
                if (dia == 31) {
                    nombreMes = "Abril";
                    dia = 1;
                } else {
                    nombreMes = "Marzo";
                    dia++;
                }
                break;
            case 4: // Abril
                if (dia == 30) {
                    nombreMes = "Mayo";
                    dia = 1;
                } else {
                    nombreMes = "Abril";
                    dia++;
                }
                break;
            case 5: // Mayo
                if (dia == 31) {
                    nombreMes = "Junio";
                    dia = 1;
                } else {
                    nombreMes = "Mayo";
                    dia++;
                }
                break;
            case 6: // Junio
                if (dia == 30) {
                    nombreMes = "Julio";
                    dia = 1;
                } else {
                    nombreMes = "Junio";
                    dia++;
                }
                break;
            case 7: // Julio
                if (dia == 31) {
                    nombreMes = "Agosto";
                    dia = 1;
                } else {
                    nombreMes = "Julio";
                    dia++;
                }
                break;
            case 8: // Agosto
                if (dia == 31) {
                    nombreMes = "Septiembre";
                    dia = 1;
                } else {
                    nombreMes = "Agosto";
                    dia++;
                }
                break;
            case 9: // Septiembre
                if (dia == 30) {
                    nombreMes = "Octubre";
                    dia = 1;
                } else {
                    nombreMes = "Septiembre";
                    dia++;
                }
                break;
            case 10: // Octubre
                if (dia == 31) {
                    nombreMes = "Noviembre";
                    dia = 1;
                } else {
                    nombreMes = "Octubre";
                    dia++;
                }
                break;
            case 11: // Noviembre
                if (dia == 30) {
                    nombreMes = "Diciembre";
                    dia = 1;
                } else {
                    nombreMes = "Noviembre";
                    dia++;
                }
                break;
            case 12: // Diciembre
                if (dia == 31) {
                    nombreMes = "Enero";
                    dia = 1;
                    anho++;
                } else {
                    nombreMes = "Diciembre";
                    dia++;
                }
                break;
         /* No hace falta una label default, ya que el programa siempre se asegurará de que "mes" esté entre 1 y 12.
          * De todas formas, podríamos hacer:
          * default:
            * System.out.printf("El mes %d introducido no es válido\n", mes);
            * break;
            */
        }
        // No seguiremos analizando la fecha, ya que los años son infinitos.
        System.out.printf("La fecha de mañana será el día %d de %s del año %d\n", dia, nombreMes, anho);
    }
}