package ud1.ejercicios.lsh20241004;

import java.util.Scanner;

/*
 * EP0123_ConversionMasa. Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. 
 * El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
 * 1 kilogramo = 1000 gramos
 * 1 libra = 453.592 gramos
 * El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. Utiliza el operador ternario para evaluar la 
 * unidad de medida introducida por el usuario. 
 * El programa mostrará por pantalla el resultado con la unidad de medida adecuada.
 */
public class EP0123 {
    public static void main(String[] args) {
        double masa;
        int choose;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce la cantidad de masa: ");
            masa = sc.nextDouble();
            System.out.print("Introduce la unidad de medida origen, kilogramos (1) o libras (2): ");
            choose = sc.nextInt();
        }

        double resultado = choose == 2 ? masa * 453.592 / 1000 : masa * 1000 / 453.502;
        String unidadMedida = choose == 1 ? "libras" : choose == 2 ? "kilogramos" : "medida desconocida";
        System.out.printf("La masa final es: %.2f %s\n", resultado, unidadMedida);
    }
}