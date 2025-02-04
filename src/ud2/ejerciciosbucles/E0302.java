package ud2.ejerciciosbucles;

import java.util.Scanner;
/*
 * Implementar una aplicación para calcular datos estadísticos de las edades de los
 * alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea
 * negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número
 * de alumnos y cuántos son mayores de edad.

 */
public class E0302 {
    public static void main(String[] args) {
        int edad = 0;
        double suma = 0.0;
        double edadTotal = 0.0;
        int numAlumnos = 0;
        int mayoresDeEdad = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad del primer alumno: ");
        edad = sc.nextInt();
        numAlumnos++;

        while (!(edad < 0)) {
            suma = edad;
            edadTotal = edad + suma;
            numAlumnos++;
            if (edad >= 18) {
                mayoresDeEdad++;
            }
            System.out.print("Introduce la edad del siguiente alumno: ");
            edad = sc.nextInt();
        }
        sc.close();

        System.out.println("La suma de todas las edades introducidas es: " + edadTotal);
        System.out.println("La media de todas las edades introducidas es: " + edadTotal/numAlumnos);
        System.out.println("Número de alumnos: " + numAlumnos);
        System.out.println("El número de alumnos que son mayores de edad es: " + mayoresDeEdad);
    }
}
