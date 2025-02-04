package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
 * EP0515. Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
 * Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros)
 * del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del grupo en
 * cada trimestre y la media del alumno que se encuentra en una posición dada (que el usuario
 * introduce por teclado).
 */
public class EP0515 {
    static Scanner sc;

    public static int[] solicitarNotas() {
        sc = new Scanner(System.in);
        int[] grupo = new int[0];

        while (grupo.length != 15) {
            if (grupo.length <= 5)
                System.out.print("Introduce las notas del primer trimestre del grupo: ");
              else if (grupo.length <= 10)
                System.out.print("Introduce las notas del segundo trimestre del grupo: ");
              else
                System.out.print("Introduce las notas del tercer trimestre del grupo: ");
            
            grupo = Arrays.copyOf(grupo, grupo.length + 1);
            grupo[grupo.length - 1] = sc.nextInt();            
        }

        sc.close();

        return grupo;
    }

    public static int calcularMedia(int[] grupo) {
        int suma = 0;
        for (int i = 0; i < grupo.length; i++) {
            suma += grupo[i];
        }

        return suma / grupo.length;
    }

    private static void consultarMedia(int[] grupo) {
        System.out.print("Introduce la posición del alumno cuya nota quieres consultar: ");
        // int posicion = sc.nextInt();

        for (int i = 0; i < grupo.length; i++) {
            
        }

        System.out.println("La nota media del alumno en dicha posición es:");

    }

    public static void main(String[] args) {
        int[] grupo = solicitarNotas();
        
        calcularMedia(grupo);
        
        consultarMedia(grupo);
    }            
}
