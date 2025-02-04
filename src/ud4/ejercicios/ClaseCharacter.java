package ud4.ejercicios;

import java.util.Scanner;

/*
 * ClaseCharacter. Crea un programa que lea un caracter de teclado y, utilizando los
métodos anteriores de la clase Character, imprima:
● Si es un dígito
● Si es una letra
● Si es un dígito o una letra
● etc.
● Si es mayúscula y en caso afirmativo mostrar la letra minúscula equivalente.
● Si es minúscula y en caso afirmativo mostrar la letra mayúscula equivalente
 */
public class ClaseCharacter {

    public static void main(String[] args) {
        char c = ' ';
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un caracter. Solo el primer caracter sera analizado: ");
            c = sc.nextLine().charAt(0);
        } catch (Exception e) {
            System.out.println("No has introducido un caracter válido."); 
            sc.close();
        }
        sc.close();

        boolean is_digit_or_letter = false;
        if (Character.isDigit(c)) {
            System.out.println("Es un dígito: " + c);
            is_digit_or_letter = true;
        }
        if (Character.isLetter(c)) {
            System.out.println("Es una letra: " + c);
            is_digit_or_letter = true;
        }

        if (is_digit_or_letter) {
            System.out.println("La letra " + c + " es un dígito o una letra.");
        } else {
            System.out.println("La letra " + c + " NO es un dígito o una letra.");
            return; // No puedes seguir usando el código siguiente si el dígito no es una letra
        }

        if (Character.isLowerCase(c)) {
            System.out.println("El caracter" + c + "es una letra minúscula.");
            System.out.println("En mayúscula sería: " + Character.toUpperCase(c));
        } else if (Character.isUpperCase(c)) {
            System.out.println("El caracter" + c + "es una letra mayúscula.");
            System.out.println("En minúscula sería: " + Character.toLowerCase(c));
        }     
    }
}
