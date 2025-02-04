package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Realiza un programa que solicite por teclado un nombre de usuario y
 * contraseña, y que compruebe si corresponden al usuario “admin” con contraseña “abc123.,”
 * indicando como resultado un mensaje apropiado.
 */

public class EP0220_Login {
    public static void main(String[] args) {
        String usuario = "";
        String contrasenha = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre de usuario: ");
        usuario = sc.nextLine();
        System.out.print("Introduce tu contraseña: ");
        contrasenha = sc.nextLine();
        sc.close();

        if (usuario == "admin" && contrasenha == "abc123.,") {
            System.out.println("Usuario y contraseña correctos.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
