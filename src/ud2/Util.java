package ud2;

import java.util.Scanner;

public class Util {
    
    public static void imprimirTrianguloRectangulo(int n) {
        for (int i = 0; i <= n; i++) { 
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
    
    public static boolean esBisiesto(int anho) {
        return (anho % 100 == 0) && (anho % 400 == 0) || (anho % 4 == 0) && !(anho % 100 == 0);
    }

    public static boolean esCasiCero(double numero) {
        return numero < 1.0 && numero > -1.0 && numero != 0;
    }

    public static int mayor(int a, int b) {
        return a > b ? a : b;
    }
    
    public static String notaEnTexto(int nota) {
        String notaEnTexto = "";

        if (nota < 0 || nota > 10)
            return notaEnTexto;

        switch(nota) {
            case 0, 1, 2, 3, 4:
                notaEnTexto = "Suspenso";
                break;
            case 5:
                notaEnTexto = "Aprobado";
                break;
            case 6:
                notaEnTexto = "Bien";
                break;
            case 7, 8:
                notaEnTexto = "Notable";
                break;
            case 9, 10:
                notaEnTexto = "Sobresaliente";
                break;
            default:
                break;
        }

        return notaEnTexto;
    }

    public static String notaEnTexto(double nota) {
        String notaEnTexto = "";

        if (nota < 0 || nota > 10)
            return notaEnTexto;

        if (nota >= 0 && nota < 5) {
            notaEnTexto = "Suspenso";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "Aprobado";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "Bien";
        } else if (nota >= 7 && nota < 8) {
            notaEnTexto = "Notable";
        } else if (nota >= 9 && nota < 10){
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

    public static void cajaTexto(String str, String caracter) {
        int n = str.length();
        
        imprimirLinea(n, caracter);
        System.out.println(caracter + " " + str + " " + caracter);
        imprimirLinea(n, caracter);
    }

    public static void imprimirLinea(int n, String caracter) {
        for (int i = 1; i <= n + 2 /* sumo la longitud de los dos espacios para formatear mejor la caja en consola */; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }

    // Testeo de todas las funciones
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        System.out.print("Introduce un caracter a escribir: ");
        String caracter = sc.nextLine();
        cajaTexto(cadena, caracter);

        double nota = 8.7;
        System.out.println(notaEnTexto(nota));
        int notaInt = 5;
        System.out.println(notaEnTexto(notaInt));

        System.out.print("Número / Anho: ");
        int n = sc.nextInt();
        sc.close();

        if (esPar(n)) {
            System.out.println("Es un número par");
        } else {
            System.out.println("No es un número par.");
        }

        if (esBisiesto(n)) {
            System.out.println("Es un año bisiesto.");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
