package lshexamen.ud2.practicas;

import java.util.Scanner;

// @Author Hugo Lorenzo Silva

public class MenuFiguras {

    public static void triangulo(Scanner sc) {
        int numero = 0;

        System.out.print("Escribe un número entero entre 2 y 20: ");
        numero = sc.nextInt();

        while (numero < 2 || numero > 20) {
            System.out.println("Error. Número introducido no correcto. Introduce un nuevo número: ");
            numero = sc.nextInt();
        }

        for (int i = 0; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        menu();
    }

    public static void rectangulo(Scanner sc) {
        int filas = 0;
        int columnas = 0;

        System.out.print("Introduce un número entero entre 2 y 20 para dibujar las filas de un rectángulo: ");
        filas = sc.nextInt();
        System.out.print("Introduce un número entero entre 2 y 20 para dibujar las columnas de un rectángulo: ");
        columnas = sc.nextInt();

        while (filas < 2 || filas > 20) {
            System.out.println("Número de filas introducido no correcto. Introduce un nuevo número: ");
            filas = sc.nextInt();
        }

        while (columnas < 2 || columnas > 20) {
            System.out.println("Número de columnas introducido no correcto. Introduce un nuevo número: ");
            columnas = sc.nextInt();
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        menu();
    }

    public static void menu() {
        int fallos = 0;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("0. SALIR");

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            while (opcion < 0 || opcion > 2) {
                fallos++;
                if (fallos == 3) {
                    System.out.println("Has llegado al número máximo de errores (3).");
                    break;
                }

                System.out.printf("Opción incorrecta. Número de errores: %d\nIntroduce de nuevo una opción: ", fallos);
                opcion = sc.nextInt();
            }
        } catch (Exception e) { // Normalmente InputMismatchException
            System.out.println("Excepción: " + e + ". No has introducido un número. Cerrando programa...");
            fallos++;
            menu();
        }

        if (opcion == 0 || fallos >= 3)
            System.out.println("¡Hasta la próxima!");

        switch (opcion) {
            case 1:
                triangulo(sc);
                break;
            case 2:
                rectangulo(sc);
                break;
            default:
                break;
        }
        sc.close();
    }

    public static void main(String[] args) {
        // Introducir aquí otras comprobaciones si es necesario
        menu();
    }
}
