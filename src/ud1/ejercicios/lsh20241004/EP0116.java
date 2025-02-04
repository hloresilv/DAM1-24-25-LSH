package ud1.ejercicios.lsh20241004;

import java.util.Scanner;
/*
 * EP0116. Solicita al usuario tres distancias:
 * La primera, medida en milímetros.
 * La segunda, medida en centímetros.
 * La última, medida en metros.
 * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
 * centimetros).
 */
public class EP0116 {
    public static void main(String[] args) {
        double milimetros;
        double centimetros;
        double metros;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Dame la primera distancia en milímetros: ");
            milimetros = sc.nextDouble();
            System.out.println("Dame la primera distancia en centímetros: ");
            centimetros = sc.nextDouble();
            System.out.print("Dame la primera distancia en metros: ");
            metros = sc.nextDouble();
        }

        double total = (milimetros / 1000) + centimetros + (metros * 100);
        System.out.println("La distancia total es: " + total);
    }
}
