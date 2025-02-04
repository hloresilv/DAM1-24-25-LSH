package ud2.ejemplos;

/*
* programa que lee un número n y muestra n asteriscos
*/
import java.util.*;

public class Ejemplo2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // variable que contiene el número de asteriscos a mostrar
        int contador = 0; // variable para contar los asteriscos que se han mostrado

        System.out.print("Introduce número de asteriscos a mostrar: ");
        n = sc.nextInt(); // leemos el número total de asteriscos a mostrar
        sc.close();

        while (contador < n) { // inicio del bucle while
            System.out.print("*");
            contador++;
        } // fin del bucle while

        System.out.printf("\n");
        System.out.println("Fin programa");
    }
}