package ud2.ejercicioscondicionales;

import java.util.Scanner;

// Pedir dos números enteros y decir si son iguales o no
public class E0202 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otr número entero: ");
        num2 = sc.nextInt();
        sc.close();

        if (num1 == num2) {
            System.out.println("Los dos números son iguales");
        } else {
            System.out.println("Los números son distintos.");
        }
    }
}
