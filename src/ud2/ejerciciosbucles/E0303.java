package ud2.ejerciciosbucles;

import java.util.Scanner;
/*
 * Codificar el juego “el número secreto”, que consiste en acertar un número entre 1
 * y 100 (generado aleatoriamente). Para ello se introduce por teclado una serie de
 * números, para los que se indica: “mayor” o “menor”, según sea mayor o menor con
 * respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se
 * rinde (introduciendo un -1).
 *
 * Amplía el programa para que muestre el número secreto cuando el usuario se rinda y el
 * número de intentos cuando haya acertado.
 */
public class E0303 {
    public static void main(String[] args) {
        double numeroSecreto = (int)(Math.random() * 99);
        double numeroIntroducido = 0.0;
        int eleccion;
        int numIntentos = 0;

        Scanner sc = new Scanner(System.in);
        numeroIntroducido = sc.nextDouble();
        
        while (numeroSecreto != numeroIntroducido) {
            numIntentos++;
            System.out.println("El número introducido no es igual al número secreto.");
            if (numeroIntroducido > numeroSecreto) {
                System.out.println("El número introducido es mayor al número secreto");
            } else {
                System.out.println("El número introducido es menor al número secreto.");
            }
            System.out.println("¿Te rindes? (No = 0, Si = 1)");
            eleccion = sc.nextInt();
            if (eleccion == 1) {
                System.out.println("El número secreto es: ");
            } else if (eleccion == 0) {
                System.out.println("Introduce un nuevo número: ");
                numeroIntroducido = sc.nextInt();
            } else {
                System.out.println("Elección incorrecta. Introduce 0 o 1.");
                eleccion = sc.nextInt();
            } 
        }
        System.out.println("¡Has acertado! El número de intentos es: " + numIntentos);
        sc.close();
    }
}
