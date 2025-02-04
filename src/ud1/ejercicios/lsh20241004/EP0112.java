package ud1.ejercicios.lsh20241004;

import java.util.Scanner;

/*
 * Área Triángulo = (base * altura) / 2
 * Crea un programa que pida la base y la altura de un triángulo y muestre su áre
 */

public class EP0112 {
    void main() {
        double base = 0.0;
        double height = 0.0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce la base del triángulo: ");
            base = sc.nextDouble();
            System.out.print("Introduce la altura del triángulo: ");
            height = sc.nextDouble();
        } catch (NumberFormatException exception) {
            System.out.println("El número que has introducido no es válido.");
        }

        double area = (base * height) / 2.0;
        
        if (area >= 0) {
        System.out.println("La área del triángulo es: " + area);
        } else {
        System.out.println("No se puede determinar el área del triangulo.");
        }
    }
}
