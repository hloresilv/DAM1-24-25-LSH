/*
 * Implementar una aplicación que pida al usuario un número comprendido entre 1 y
 * 10. Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el
 * número introducido se encuentra en el rango establecido.
 */

 package ud2.ejerciciosbucles;
 import java.util.Scanner;

 public class E0309 {
    public static void main(String[] args) {
        double numero;
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número comprendido entre 1 y 10: ");
        numero = sc.nextDouble();
        sc.close();

        if ((int)numero <= 10 && (int)numero >= 1) {
            System.out.println("Tabla de multiplicar para el número introducido:");
            for (int i = 0; i <= 10; i++) {
                System.out.print((int)numero + " x " + i + " = ");
                System.out.println((int)numero*i);
            }
        } else {
            System.out.println("Numero introducido no se encuentra en el rango establecido.");
        }
    }
 }