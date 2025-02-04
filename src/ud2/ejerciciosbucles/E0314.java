package ud2.ejerciciosbucles;

/*
 * Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
 */
public class E0314 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar de " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " multiplicado por " + j + " es " + i*j);
            }
            System.out.println("--------------------");
        }
    }
}
