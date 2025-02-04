package ud2.ejerciciosfunciones;

/*
 * E0410. Diseñar una función que calcule a elevado a n,
 * donde a es real y n es entero no negativo.
 * Realizar una versión iterativa y otra recursiva.
 */

public class E0410 {
    private static double calculoIterativo(double base, int exponente) {
        double resultado = 0;

        for (int i = 1; i < exponente; i++) {
            double suma = base * base;
            resultado = suma + resultado;
        }

        return resultado;
    }

    private static double calculoRecursivo(double base, int exponente) {
        double resultado = 0;

        for (int i = 0; i < exponente; i++) {

            resultado = calculoRecursivo(base, exponente) * calculoRecursivo(base, exponente);
        }

        return resultado;
    }

    public static void main(String[] args) {
        double base = 2.4;
        int exponente = 3;

        System.out.println("El resultado iterativo es: " + calculoIterativo(base, exponente));
        System.out.println("El resultado recursivo es: " + calculoRecursivo(base, exponente));
    }
}
