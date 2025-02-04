package ud2.ejercicioscondicionales;

import java.util.Scanner;

// Pedir tres números y mostrarlos ordenados de mayor a menor.

public class E0207 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el priner número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();
        System.out.print("Introduce el tercer número: ");
        num3 = sc.nextDouble();
        sc.close();

        double mayor = Math.max(num1, Math.max(num2, num3));
        double menor = Math.min(num1, Math.min(num2, num3));
        double intermedio = num1 + num2 + num3 - mayor - menor;
        
        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + intermedio + ", " + menor);
    }
}